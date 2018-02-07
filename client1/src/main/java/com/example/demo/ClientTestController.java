package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
@Controller
public class ClientTestController {
    @Value("${server.port}")
    private  String port;
    @RequestMapping("/test")
    public String test(String name){
        return "hi "+name +" port:"+port;
    }
}
