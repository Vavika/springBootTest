package com.example.demo;

import com.netflix.ribbon.hystrix.FallbackHandler;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import com.sun.jersey.spi.StringReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestService{
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "testError")
   public  String test(String name){
      return restTemplate.getForObject("http://client1/test/?name=flq",String.class);
   }

   public  String testError(String name){
       return "sorry "+name;
   }
}
