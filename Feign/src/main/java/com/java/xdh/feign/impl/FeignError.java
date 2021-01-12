package com.java.xdh.feign.impl;

import com.java.xdh.entity.Student;
import com.java.xdh.feign.FeignProviderClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @author 薛登辉
 * @version 1.0
 * @time 2021/1/11 0011
 */
@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器正在维护中.......请稍等片刻";
    }
}
