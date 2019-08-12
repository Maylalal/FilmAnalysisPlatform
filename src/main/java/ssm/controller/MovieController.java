package ssm.controller;

import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ssm.pojo.Actor;
import ssm.pojo.Director;
import ssm.pojo.Movie;
import ssm.service.ActorService;
import ssm.service.DirectorService;
import ssm.service.MovieService;

import javax.swing.*;
import java.util.List;

@Controller
public class MovieController {
    @Autowired
    ActorService actorService;

    @Autowired
    DirectorService directorService;

    @RequestMapping("/findActor")
    public String findActor(Model model){
        List<Actor> list = actorService.showActorList();
        JSONArray jsonArray = JSONArray.fromObject(list);
        model.addAttribute("movieList",jsonArray);
        return "result";
    }

    @RequestMapping("/findDirector")
    public String findDirector(Model model){
        List<Director> list = directorService.showDirectorList();
        JSONArray jsonArray = JSONArray.fromObject(list);
        model.addAttribute("movieList",jsonArray);
        return "result";
    }
}
