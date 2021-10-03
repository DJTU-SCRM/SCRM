package com.example.scrm.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * TODO
 *
 * @author Steven
 * @version 1.0
 * @date 2021/10/3 16:36
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginLog implements Serializable {
    private static final long serialVersionUID = -7440711887634642686L;
    private int id;
    private String ip;    //登录的ip
    private String no;       //登录用户名账号
    private Date createtime;   //登录的时间
    private String location;    //登录的地址

    public LoginLog(String ip, String no, Date createtime, String location) {
        this.ip = ip;
        this.no = no;
        this.createtime = createtime;
        this.location = location;
    }
}