package com.java.xdh.controller;

import com.java.xdh.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * @author 薛登辉
 * @version 1.0
 * @time 2021/1/10 0010
 */
@RestController
@RequestMapping("/ribbon")
public class RibbonHandler {

    @Autowired
    private RestTemplate restTemplate;
    //1、查询所有
    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return restTemplate.getForObject("http://provider/student/findAll",Collection.class);
    }

    @GetMapping("/index")
    public String index(){
        return restTemplate.getForObject("http://provider/student/index",String.class);
    }


}
