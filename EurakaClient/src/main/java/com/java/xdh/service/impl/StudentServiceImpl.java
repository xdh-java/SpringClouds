package com.java.xdh.service.impl;

import com.java.xdh.entity.Student;
import com.java.xdh.repository.StudentRepository;
import com.java.xdh.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * @author 薛登辉
 * @version 1.0
 * @time 2021/1/9 0009
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Collection<Student> findAll() {
        return studentRepository.findAll();
    }
}
