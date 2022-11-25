package com.atguigu.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author malaoda
 * @create 2022-11-22 11:02
 */
@RestController
public class OrderConsulController {

    @Resource
    private RestTemplate restTemplate;

    public static final String INVOME_URL = "http://consul-provider-payment";

    @GetMapping("/consumer/payment/consul")
    public String payment(){
        String result = restTemplate.getForObject(INVOME_URL+"/payment/consul",String.class);
        return result;
    }
}
