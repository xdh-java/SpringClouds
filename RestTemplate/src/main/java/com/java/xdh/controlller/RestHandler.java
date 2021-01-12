package com.java.xdh.controlller;

import com.java.xdh.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * @author 薛登辉
 * @version 1.0
 * @time 2021/1/9 0009
 */
@RestController
@RequestMapping("/rest")
public class RestHandler {

    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return restTemplate.getForEntity("http://localhost:8010/student/findAll",Collection.class).getBody();
    }
    //第二种写法
    @GetMapping("/findAll2")
    public Collection<Student> findAll2(){
        return restTemplate.getForObject("http://localhost:8010/student/findAll",Collection.class);
    }
    //2、根据id找到所有学生对象
    @GetMapping("/findAllById/{id}")
    public Student findAllById(@PathVariable("id") long id){
        return restTemplate.getForEntity("http://localhost:8010/student/findAllById/{id}",Student.class,id).getBody();
    }
    //2.1另外一种写法
    @GetMapping("/findAllById2/{id}")
    public Student findAllById2(@PathVariable("id") long id){
        return restTemplate.getForObject("http://localhost:8010/student/findAllById/{id}",Student.class);
    }
    //3、插入方法
    @PostMapping("/save")
    public void save(@RequestBody Student student){
        restTemplate.postForEntity("http://localhost:8010/student/save",student,null).getBody();
    }
    //3.1插入另一种方法
    @PostMapping("/save2")
    public void save2(@RequestBody Student student){
        restTemplate.postForObject("http://localhost:8010/student/save",student,null);
    }
    //修改的操作
    @PutMapping("/update")
    public void update(@RequestBody Student student){
        restTemplate.put("http://localhost:8010/student/update",student);
    }
    //删除操作
    @DeleteMapping("/deleteById/{id}")
    public void delete(@PathVariable("id") long id){
        restTemplate.delete("http://localhost:8010/student/deleteById/{id}",id);
    }
















}
