package com.java.xdh.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @author 薛登辉
 * @version 1.0
 * @time 2021/1/9 0009
 */
@Data
@AllArgsConstructor
//无参构造方法
@NoArgsConstructor
public class Student {
    private Long id;
    private String name;
    private Integer age;
    private char sex;

}
