package ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ssm.mapper.MoviesMapper;
import ssm.pojo.Movies;
import ssm.pojo.MoviesExample;

import java.util.List;

@Controller
public class SolrController {
    @Autowired
    private MoviesMapper moviesMapper;

    @Autowired
    private SolrTemplate solrTemplate;


     // 实现将数据库中的数据批量导入到Solr索引库中


    @RequestMapping("/addSolr")
    public String importMoviesData() {

        MoviesExample moviesExample = new MoviesExample();
        List<Movies> list = moviesMapper.selectByExample(moviesExample);

        System.out.println("====电影列表====");

        for (Movies movies : list) {
            System.out.println(movies.getTitle());
        }

        solrTemplate.saveBeans(list);
        solrTemplate.commit(); //提交
        System.out.println("====结束====");
        return "success";
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-solr.xml");
        SolrController solrController = (SolrController) context.getBean("solrController");
        solrController.importMoviesData();
    }

}
