package ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ssm.service.AddDataService;

@Controller
public class AddDataController {

    @Autowired
    AddDataService addDataService;

    @RequestMapping("/addData")
    public String update(){
        addDataService.update();
        return "success";
    }
}
