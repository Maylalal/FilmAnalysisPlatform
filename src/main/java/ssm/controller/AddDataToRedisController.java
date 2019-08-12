package ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ssm.service.AddDataToRedisService;

@Controller
public class AddDataToRedisController {

    @Autowired
    RedisTemplate<String,Object> redisTemplate;

    @Autowired
    AddDataToRedisService addDataToRedisService;

    @RequestMapping("/redis")
    public String add2redis(){
       addDataToRedisService.add2redis();
        return "index";
    }

}
