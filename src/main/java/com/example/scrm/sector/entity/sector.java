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