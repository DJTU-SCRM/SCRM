package com.example.scrm.admin.user.service;

import org.apache.ibatis.annotations.Param;

import java.io.UnsupportedEncodingException;

import com.example.scrm.admin.user.entity.User;

import java.util.List;

public interface UserService {
    /**
     *
     * @param userAccount
     * @param userPwd
     * @return
     */
    int userLogin(@Param("userAccount") String userAccount, @Param("userPwd") String userPwd)throws UnsupportedEncodingException;



    int deleteByPrimaryKey(String userAccount);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByUser(User user);

    User selectByPrimaryKey(String userAccount);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
