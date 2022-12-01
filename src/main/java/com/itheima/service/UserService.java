package com.itheima.service;

import com.itheima.domian.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * 用户业务层接口
 */
public interface UserService {
    /**
     * 查询用户列表
     */

    List<User> findAll();

    User findById(Integer userId);

    void updateUser(User user);

}
