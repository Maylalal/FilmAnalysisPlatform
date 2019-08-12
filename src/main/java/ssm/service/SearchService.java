package ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.core.query.*;
import org.springframework.data.solr.core.query.result.HighlightPage;
import org.springframework.stereotype.Service;
import ssm.mapper.MoviesMapper;
import ssm.pojo.Movies;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SearchService {

    @Autowired
    MoviesMapper moviesMapper;

    @Autowired
    SolrTemplate solrTemplate;

    public List<Movies> search(Map<String, Object> searchMap) {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Movies> list = searchList(searchMap);
        return list;
    }

    private List<Movies> searchList(Map searchMap) {
        Map map = new HashMap();

        //高亮配置
        HighlightQuery query = new SimpleHighlightQuery();
        HighlightOptions highlightOptions = new HighlightOptions().addField("movie_title"); //设置高亮的域
        highlightOptions.setSimplePrefix("<em style='color: red'>"); //设置高亮前缀
        highlightOptions.setSimplePostfix("</em>"); //设置高亮后缀
        query.setHighlightOptions(highlightOptions); //设置高亮选项

        //关键字空格处理
        String keywords = (String) searchMap.get("keywords");

        if(keywords != null){
            searchMap.put("keywords", keywords.replace(" ", ""));
        }

        Criteria criteria = new Criteria("movie_keywords");
        //按照关键字查询
        if (searchMap.get("keywords") != null) {
            if (!searchMap.get("keywords").equals("")) {
                criteria.is(searchMap.get("keywords"));
            }
        }
        query.addCriteria(criteria);

        //按地区分类过滤
        if (searchMap.get("area") != null) {
            if (!searchMap.get("area").equals("")) {
                System.out.println("执行了area");
                FilterQuery filterQuery = new SimpleFilterQuery();
                Criteria filterCriteria = new Criteria("movie_area").is(searchMap.get("area"));
                filterQuery.addCriteria(filterCriteria);
                query.addFilterQuery(filterQuery);
            }
        }

        //按类型过滤
        if (searchMap.get("type") != null) {
            if (!searchMap.get("type").equals("")) {
                System.out.println("执行了type...");
                FilterQuery filterQuery = new SimpleFilterQuery();
                Criteria filterCriteria = new Criteria("movie_type").is(searchMap.get("type"));
                filterQuery.addCriteria(filterCriteria);
                query.addFilterQuery(filterQuery);
            }
        }
        //按评分区间查询
        if (searchMap.get("score") != null) {
            if (!searchMap.get("score").equals("")) {
                String[] scores = ((String) searchMap.get("score")).split("-");
                if (!scores[0].equals("0")) {
                    //如果起点区间不等于0
                    Criteria filterCriteria = new Criteria("movie_score").greaterThanEqual(scores[0]);
                    FilterQuery filterQuery = new SimpleFilterQuery(filterCriteria);
                    query.addFilterQuery(filterQuery);
                }

                if (!scores[1].equals("*")) {
                    //如果区间重点不等于*
                    Criteria filterCriteria = new Criteria("movie_score").lessThanEqual(scores[1]);
                    FilterQuery filterQuery = new SimpleFilterQuery(filterCriteria);
                    query.addFilterQuery(filterQuery);
                }
            }
        }

        //按评分的升降序查询
        if (searchMap.get("sortScore") != null) {
            if (!searchMap.get("sortScore").equals("")) {
                String sortValue = (String) searchMap.get("sortScore");
                if (sortValue != null && !sortValue.equals("")) {
                    if (sortValue.equals("asc")) {
                        Sort sort = new Sort(Sort.Direction.ASC, "movie_" + "score");
                        query.addSort(sort);
                    }
                    if (sortValue.equals("desc")) {
                        Sort sort = new Sort(Sort.Direction.DESC, "movie_" + "score");
                        query.addSort(sort);
                    }
                }
            }
        }
        //按票房升降排序
        if (searchMap.get("sortBox") != null) {
            if (!searchMap.get("sortBox").equals("")) {
                String sortValue = (String) searchMap.get("sortBox");
                if (sortValue != null && !sortValue.equals("")) {
                    if (sortValue.equals("asc")) {
                        Sort sort = new Sort(Sort.Direction.ASC, "movie_" + "box");
                        query.addSort(sort);
                    }
                    if (sortValue.equals("desc")) {
                        Sort sort = new Sort(Sort.Direction.DESC, "movie_" + "box");
                        query.addSort(sort);
                    }
                }
            }
        }

        HighlightPage<Movies> page = solrTemplate.queryForHighlightPage(query, Movies.class);
        return page.getContent();
    }
}
