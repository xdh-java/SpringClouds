package com.java.xdh.repository;

import com.java.xdh.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collection;

/**
 * @author 薛登辉
 * @version 1.0
 * @time 2021/1/9 0009
 */
@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;
    @Test
    void test01() {
        Collection<Student> collection = studentRepository.findAll();
        System.out.println(collection);
    }
}