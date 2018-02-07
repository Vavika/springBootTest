package com.example.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "client1",fallback = FeginInterfaceIml.class)
public interface FeignInterface {

    @RequestMapping("/test")

    public String say(@RequestParam(value = "name") String name);
}
