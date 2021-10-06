package com.example.scrm.admin.user.service;

import org.apache.ibatis.annotations.Param;

import java.io.UnsupportedEncodingException;

public interface UserService {
    /**
     *
     * @param userAccount
     * @param userPwd
     * @return
     */
    int userLogin(@Param("userAccount") String userAccount, @Param("userPwd") String userPwd)throws UnsupportedEncodingException;


}
