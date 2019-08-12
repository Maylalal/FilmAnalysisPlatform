package ssm.controller;

import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ssm.service.PredirectService;

@Controller
public class PredirectController {

    @Autowired
    PredirectService predirectService;

    @RequestMapping("/forecastBox")
    public String forecastBox(String director, String actor1 , String actor2 , String actor3,String actor4 ,Model model){
        double box = predirectService.forecastBox(director,actor1,actor2,actor3,actor1);
        JSONArray jsonArray = JSONArray.fromObject(box);
        model.addAttribute("box",jsonArray);
        return "forecastBox";
    }

}
