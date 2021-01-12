package com.java.xdh.controller;

import com.java.xdh.entity.Student;
import com.java.xdh.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * @author 薛登辉
 * @version 1.0
 * @time 2021/1/11 0011
 */
@RestController
@RequestMapping("/feign")
public class FeignHandler {

    @Autowired
    private FeignProviderClient feignProviderClient;

    @GetMapping("/findAll")
    public Collection<Student> findAll() {
        return feignProviderClient.findAll();
    }

    @GetMapping("/index")
    public String index(){
        return feignProviderClient.index();
    }




}
