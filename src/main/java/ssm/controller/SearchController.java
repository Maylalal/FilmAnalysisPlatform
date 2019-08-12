package ssm.controller;

import com.google.gson.Gson;
import net.sf.json.JSONArray;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import ssm.mapper.MoviesMapper;
import ssm.pojo.Movies;
import ssm.service.SearchService;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class SearchController {
    @Autowired
    SearchService searchService;

    @RequestMapping("/search")
    public String search(Model model, String... args) {
        Map<String,Object> searchMap = new HashMap<>();
        for (String s : args){
            String [] s1 = s.split("!");
            searchMap.put(s1[0],s1[1]);
        }

        List<Movies> list = searchService.search(searchMap);
        JSONArray jsonArray = JSONArray.fromObject(list);
        model.addAttribute("list",jsonArray);
        return "success";
    }
   /* public String search(String area, Model model) {
        Map<String,Object> searchMap = new HashMap<>();
        searchMap.put("area","中国");
        Map<String,Object> map =  searchService.search(searchMap);
        model.addAttribute("map",map);
        return "result";
    }*/

}
