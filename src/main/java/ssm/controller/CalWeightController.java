package ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ssm.service.CalWeightService;

@Controller
public class CalWeightController {

    @Autowired
    CalWeightService calWeightService;

    @RequestMapping("/calActor")
    public String calActorWeight(){
        calWeightService.calActorWeight();
        return "success";
    }

    @RequestMapping("/calDirector")
    public String calDirectorWeight(){
        calWeightService.calDirectorWeight();
        return "success";
    }
}
