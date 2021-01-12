package com.java.xdh.feign;

import com.java.xdh.entity.Student;
import com.java.xdh.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * @author 薛登辉
 * @version 1.0
 * @time 2021/1/11 0011
 */
@FeignClient(value = "provider",fallback = FeignError.class)
public interface FeignProviderClient {

    //查询所有
    @GetMapping("/student/findAll")
    public Collection<Student> findAll();
    //返回当前的端口
    @GetMapping("/student/index")
    public String index();

}
