package com.java.xdh.eneity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 薛登辉
 * @version 1.0
 * @time 2021/1/11 0011
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Integer id;
    private String name;
    private Integer age;
    private char sex;

}
