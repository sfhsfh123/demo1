package com.itheima.test;

import com.itheima.domian.User;
import com.itheima.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * 用户的业务层测试
 */
@SpringBootTest
public class UserTest {

    @Autowired
    private UserService userService;

    @Test
    public void testFindAll(){
        List<User> users = userService.findAll();
        System.out.println(users);
    }
    @Test
    public void testFindById(){
        User user = userService.findById(1);
        System.out.println(user);
    }
    @Test
    public void testUpdate(){
        User user = userService.findById(1);
        System.out.println("修改之前的用户:"+ user);
        user.setAge(100);
        userService.updateUser(user);
        user = userService.findById(1);
        System.out.println("修改之后的用户："+ user);
    }
}
