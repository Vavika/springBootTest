package com.example.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {

    @Autowired
    private FeignInterface feignInterface;
    @RequestMapping("/hi")
    public String test(String name){
        return feignInterface.say(name);
    }
}
