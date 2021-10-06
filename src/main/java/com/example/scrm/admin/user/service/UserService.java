package com.example.scrm.admin.user.service;

import com.example.scrm.admin.user.entity.User;

import java.util.List;

public interface UserService {

    int deleteByPrimaryKey(String userAccount);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByUser(User user);

    User selectByPrimaryKey(String userAccount);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
