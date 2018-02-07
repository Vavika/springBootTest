package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RibbonController {
    @Autowired
    private TestService testService;

    @RequestMapping("/")
    public String test(String name){
        return testService.test(name);
    }
}
