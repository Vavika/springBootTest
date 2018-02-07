package com.example.feign;

import org.springframework.stereotype.Component;

@Component

public class FeginInterfaceIml implements FeignInterface{
    @Override
    public String say(String name) {
        return "sorry error"+name;
    }
}
