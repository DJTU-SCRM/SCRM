package com.example.scrm.admin.user.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.*;

@Data
public class User implements Serializable {

    private String userAccount;

    private String userUuid;

    private String userPwd;

    private String userLimit;

    private String loginPlace;

    private String loginBrowser;

    private String loginIp;

    private String createdBy;

    private Date gmtCreate;

    private String lastModifiedBy;

    private Date gmtModified;

    private Integer isDeleted;

    private Integer sortNo;

    private Integer version;

    private static final long serialVersionUID = 1L;

    private String tokenBackend;//管理员token

}