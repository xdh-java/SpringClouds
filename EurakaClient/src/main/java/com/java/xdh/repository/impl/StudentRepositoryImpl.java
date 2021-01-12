package com.java.xdh.repository.impl;
import com.java.xdh.entity.Student;
import com.java.xdh.repository.StudentRepository;
import org.springframework.stereotype.Repository;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 薛登辉
 * @version 1.0
 * @time 2021/1/9 0009
 */
@Repository
public class StudentRepositoryImpl implements StudentRepository {

    private static Map<Long,Student> studentMap;

    static {
        studentMap = new HashMap<>();
        studentMap.put(1L,new Student(1L,"zs",20,'男'));
        studentMap.put(2L,new Student(2L,"ls",33,'女'));
        studentMap.put(3L,new Student(3L,"ww",40,'女'));
        studentMap.put(4L,new Student(4L,"张三丰",50,'男'));
    }

    @Override
    public Collection<Student> findAll() {
        //找到所有的学生
        return studentMap.values();
    }

    @Override
    public Student findAllById(Long id) {
        //根据id找到学生
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        //保存和修改学生信息
        studentMap.put(student.getId(),student);
    }

    @Override
    public void deleteById(Long id) {
        //根据id删除学生对象
        studentMap.remove(id);
    }
}
