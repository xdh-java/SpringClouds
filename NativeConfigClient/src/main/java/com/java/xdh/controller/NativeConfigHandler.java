package com.java.xdh.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 薛登辉
 * @version 1.0
 * @time 2021/1/11 0011
 */
@RestController
@RequestMapping("/native")
public class NativeConfigHandler {

    @Value("${server.port}")
    private String port;

    @Value("${foo}")
    private String foo;



    @GetMapping("/index")
    public String index(){
        return this.port+"<br>"+this.foo+"<br>";
    }


}
