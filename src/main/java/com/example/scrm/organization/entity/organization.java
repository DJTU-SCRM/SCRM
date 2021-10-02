package com.example.scrm.organization.entity;

import java.io.Serializable;
import java.util.Date;

public class organization implements Serializable {
    private String organizName;

    private String organizType;

    private Integer organizNo;

    private String createdBy;

    private Date gmtCreate;

    private static final long serialVersionUID = 1L;

    public String getOrganizName() {
        return organizName;
    }

    public void setOrganizName(String organizName) {
        this.organizName = organizName == null ? null : organizName.trim();
    }

    public String getOrganizType() {
        return organizType;
    }

    public void setOrganizType(String organizType) {
        this.organizType = organizType == null ? null : organizType.trim();
    }

    public Integer getOrganizNo() {
        return organizNo;
    }

    public void setOrganizNo(Integer organizNo) {
        this.organizNo = organizNo;
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

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        organization other = (organization) that;
        return (this.getOrganizName() == null ? other.getOrganizName() == null : this.getOrganizName().equals(other.getOrganizName()))
            && (this.getOrganizType() == null ? other.getOrganizType() == null : this.getOrganizType().equals(other.getOrganizType()))
            && (this.getOrganizNo() == null ? other.getOrganizNo() == null : this.getOrganizNo().equals(other.getOrganizNo()))
            && (this.getCreatedBy() == null ? other.getCreatedBy() == null : this.getCreatedBy().equals(other.getCreatedBy()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrganizName() == null) ? 0 : getOrganizName().hashCode());
        result = prime * result + ((getOrganizType() == null) ? 0 : getOrganizType().hashCode());
        result = prime * result + ((getOrganizNo() == null) ? 0 : getOrganizNo().hashCode());
        result = prime * result + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", organizName=").append(organizName);
        sb.append(", organizType=").append(organizType);
        sb.append(", organizNo=").append(organizNo);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}