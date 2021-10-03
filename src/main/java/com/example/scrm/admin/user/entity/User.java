package com.example.scrm.admin.user.entity;

import java.io.Serializable;
import java.util.Date;

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

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid == null ? null : userUuid.trim();
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public String getUserLimit() {
        return userLimit;
    }

    public void setUserLimit(String userLimit) {
        this.userLimit = userLimit == null ? null : userLimit.trim();
    }

    public String getLoginPlace() {
        return loginPlace;
    }

    public void setLoginPlace(String loginPlace) {
        this.loginPlace = loginPlace == null ? null : loginPlace.trim();
    }

    public String getLoginBrowser() {
        return loginBrowser;
    }

    public void setLoginBrowser(String loginBrowser) {
        this.loginBrowser = loginBrowser == null ? null : loginBrowser.trim();
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy == null ? null : lastModifiedBy.trim();
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userAccount=").append(userAccount);
        sb.append(", userUuid=").append(userUuid);
        sb.append(", userPwd=").append(userPwd);
        sb.append(", userLimit=").append(userLimit);
        sb.append(", loginPlace=").append(loginPlace);
        sb.append(", loginBrowser=").append(loginBrowser);
        sb.append(", loginIp=").append(loginIp);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", lastModifiedBy=").append(lastModifiedBy);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", sortNo=").append(sortNo);
        sb.append(", version=").append(version);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}