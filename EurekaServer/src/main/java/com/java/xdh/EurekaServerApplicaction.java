package com.java.xdh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 薛登辉
 * @version 1.0
 * @time 2021/1/9 0009
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplicaction {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplicaction.class,args);
    }
}
