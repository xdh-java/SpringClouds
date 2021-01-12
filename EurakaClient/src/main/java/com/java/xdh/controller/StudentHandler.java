package com.java.xdh.controller;
import com.java.xdh.entity.Student;
import com.java.xdh.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @author 薛登辉
 * @version 1.0
 * @time 2021/1/9 0009
 */
@RestController
@RequestMapping("/student")
public class StudentHandler {

    @Value("${server.port}")
    private String port;

    @Autowired
    private StudentRepository studentRepository;
    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return studentRepository.findAll();
    }

    @GetMapping("/findAllById/{id}")
    public Student findAllById(@PathVariable("id") long id){
        return studentRepository.findAllById(id);
    }
    //插入操作
    @PostMapping("/save")
    public void save(@RequestBody Student student){
        studentRepository.saveOrUpdate(student);
    }
    @PutMapping("/update")
    public void update(@RequestBody Student student){
        studentRepository.saveOrUpdate(student);
    }
    //删除的操作
    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Long id){
        studentRepository.deleteById(id);
    }

    @GetMapping("/index")
    public String index(){
        return "当前端口为:"+this.port;
    }

}
