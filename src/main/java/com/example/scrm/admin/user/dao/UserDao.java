package com.example.scrm.admin.user.dao;

import com.example.scrm.admin.user.entity.User;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component(value = "UserDao")
public interface UserDao {

    // 通过userAccout删除一条记录
    int deleteByPrimaryKey(String userAccount);

    // 插入一条用户信息
    int insert(User record);

    // 动态插入
    int insertSelective(User record);

    // 通过User对象查询用户信息并返回用户列表
    List<User> selectByUser(User user);

    //通过User对象查询用户信息并返回User对象
    User selectByPrimaryKey(String userAccount);

    //通过User对象动态修改用户信息
    int updateByPrimaryKeySelective(User record);

    //通过User对象查询用户信息
    int updateByPrimaryKey(User record);
}