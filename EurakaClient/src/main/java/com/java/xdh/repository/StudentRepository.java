package com.java.xdh.repository;
import com.java.xdh.entity.Student;
import java.util.Collection;

/**
 * @author 薛登辉
 * @version 1.0
 * @time 2021/1/9 0009
 */
public interface StudentRepository {
    //1、查询所有
    public Collection<Student> findAll();
    //2、根据id查询所有
    public Student findAllById(Long id);
    //3、修改和保存的操作
    public void saveOrUpdate(Student student);
    //4、删除操作
    public void deleteById(Long id);

}
