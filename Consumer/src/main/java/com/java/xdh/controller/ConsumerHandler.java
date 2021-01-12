package com.java.xdh.controller;

import com.java.xdh.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * @author 薛登辉
 * @version 1.0
 * @time 2021/1/10 0010
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerHandler {

    @Autowired
    private RestTemplate restTemplate;
    //1、查询所有方法
    @GetMapping("/findAllStudent")
    public Collection<Student> findAllStudent(){
        return  restTemplate.getForEntity("http://localhost:8010/student/findAll",Collection.class).getBody();
    }
    //1.1 另外一种方法
    @GetMapping("/findAllStudent2")
    public Collection<Student> findAllStudent2(){
        return restTemplate.getForObject("http://localhost:8010/student/findAll",Collection.class);
    }
    //2、根据id查询所有
    @GetMapping("/findAllStudentById/{id}")
    public Student findAllStudentById(@PathVariable("id") long id){
        return restTemplate.getForEntity("http://localhost:8010/student/findAllById/{id}",Student.class,id).getBody();
    }
    //2.1根据id查询所有方法
    @GetMapping("/findAllStudentById2/{id}")
    public Student findAllStudentById2(@PathVariable("id") long id){
        return restTemplate.getForObject("http://localhost:8010/student/findAllById/{id}",Student.class,id);
    }
    //3、更新操作
    @PostMapping("/save")
    public void SaveOrUpdate(@RequestBody Student student){
        restTemplate.postForEntity("http://localhost:8010/studnet/save",student,null).getBody();
    }
    //3.1更新操作
    @PostMapping("/save2")
    public void SaveOrUpdate2(@RequestBody Student student){
        restTemplate.postForObject("http://localhost:8010/student/save",student,null);
    }
    //4、修改的操作
    @PutMapping("/update")
    public void update(@RequestBody Student student){
        restTemplate.put("http://localhost:8010/student/update",student);
    }
    //5、删除的操作
    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id){
        restTemplate.delete("http://localhost:8010/student/deleteById/{id}",id);
    }










}
