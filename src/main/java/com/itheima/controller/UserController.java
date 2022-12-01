package com.itheima.controller;

import com.itheima.dao.UserDao;
import com.itheima.domian.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
@ResponseBody
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/findAll")
    public List<User> findAll(){
        return userService.findAll();
    }
    @GetMapping("/findById")
    public User findById(Integer id){
        return userService.findById(id);
    }
    @GetMapping("/updateUser")
    public void updateUser(User user){
        userService.updateUser(user);
    }


}
