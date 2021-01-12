package com.java.xdh.service.impl;

import com.java.xdh.entity.Student;
import com.java.xdh.service.StudentService;
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
class StudentServiceImplTest {

    @Autowired
    private StudentService studentService;
    @Test
    void test01() {
        Collection<Student> collection = studentService.findAll();
        int i = 0;
    }
}