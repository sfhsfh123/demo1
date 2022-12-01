package com.itheima.domian;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户实体类
 */
@Data//get、set
public class User implements Serializable {
    private Integer id;
    private  String username;
    private String password;
    private  Integer age;
    private String sex;
    private String email;
}
