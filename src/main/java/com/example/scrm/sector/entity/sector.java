package com.example.scrm.sector.entity;

import java.io.Serializable;
import java.util.Date;

public class sector implements Serializable {
    private String sectorName;

    private String sectorNo;

    private String sectorType;

    private String organizType;

    private String createdBy;

    private Date gmtCreate;

    private static final long serialVersionUID = 1L;

    public String getSectorName() {
        return sectorName;
    }

    public void setSectorName(String sectorName) {
        this.sectorName = sectorName == null ? null : sectorName.trim();
    }

    public String getSectorNo() {
        return sectorNo;
    }

    public void setSectorNo(String sectorNo) {
        this.sectorNo = sectorNo == null ? null : sectorNo.trim();
    }

    public String getSectorType() {
        return sectorType;
    }

    public void setSectorType(String sectorType) {
        this.sectorType = sectorType == null ? null : sectorType.trim();
    }

    public String getOrganizType() {
        return organizType;
    }

    public void setOrganizType(String organizType) {
        this.organizType = organizType == null ? null : organizType.trim();
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
        sector other = (sector) that;
        return (this.getSectorName() == null ? other.getSectorName() == null : this.getSectorName().equals(other.getSectorName()))
            && (this.getSectorNo() == null ? other.getSectorNo() == null : this.getSectorNo().equals(other.getSectorNo()))
            && (this.getSectorType() == null ? other.getSectorType() == null : this.getSectorType().equals(other.getSectorType()))
            && (this.getOrganizType() == null ? other.getOrganizType() == null : this.getOrganizType().equals(other.getOrganizType()))
            && (this.getCreatedBy() == null ? other.getCreatedBy() == null : this.getCreatedBy().equals(other.getCreatedBy()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSectorName() == null) ? 0 : getSectorName().hashCode());
        result = prime * result + ((getSectorNo() == null) ? 0 : getSectorNo().hashCode());
        result = prime * result + ((getSectorType() == null) ? 0 : getSectorType().hashCode());
        result = prime * result + ((getOrganizType() == null) ? 0 : getOrganizType().hashCode());
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
        sb.append(", sectorName=").append(sectorName);
        sb.append(", sectorNo=").append(sectorNo);
        sb.append(", sectorType=").append(sectorType);
        sb.append(", organizType=").append(organizType);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}