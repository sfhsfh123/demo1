package com.itheima.dao;

import com.itheima.domian.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * 用户的持久层接口
 */
@Mapper
public interface UserDao {
    /**
     * 查询用户列表
     */
    @Select("select * from user")
    List<User> findAll();
    @Select("select * from user where id = #{userId}")
    User findById(Integer userId);
    @Update("update user set username=#{username},password=#{password},age=#{age},sex=#{sex},email=#{email} where id=#{id}")
    void updateUser(User user);
}












