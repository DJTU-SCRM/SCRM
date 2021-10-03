package com.example.scrm.admin.customer.entity;

import java.io.Serializable;
import java.util.Date;

public class Customer implements Serializable {
    private String customerType;

    private String customerPlatformType;

    private String customerNo;

    private String customerName;

    private String buyerNick;

    private String gender;

    private String country;

    private String province;

    private String city;

    private String district;

    private String address;

    private String zip;

    private String telno;

    private String mobile;

    private String img;

    private String email;

    private String qq;

    private String wechat;

    private Date birthday;

    private Date lastPurchaseTime;

    private String label;

    private String bWList;

    private String stopped;

    private Date modifiedTime;

    private String loginPlace;

    private String loginBrowser;

    private String loginIp;

    private Date registrationTime;

    private String remark;

    private String prop1;

    private String prop2;

    private String prop3;

    private String prop4;

    private String prop5;

    private String prop6;

    private String sectorName;

    private String organizName;

    private Date loadTime;

    private static final long serialVersionUID = 1L;

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType == null ? null : customerType.trim();
    }

    public String getCustomerPlatformType() {
        return customerPlatformType;
    }

    public void setCustomerPlatformType(String customerPlatformType) {
        this.customerPlatformType = customerPlatformType == null ? null : customerPlatformType.trim();
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo == null ? null : customerNo.trim();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getBuyerNick() {
        return buyerNick;
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick == null ? null : buyerNick.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip == null ? null : zip.trim();
    }

    public String getTelno() {
        return telno;
    }

    public void setTelno(String telno) {
        this.telno = telno == null ? null : telno.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getLastPurchaseTime() {
        return lastPurchaseTime;
    }

    public void setLastPurchaseTime(Date lastPurchaseTime) {
        this.lastPurchaseTime = lastPurchaseTime;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    public String getbWList() {
        return bWList;
    }

    public void setbWList(String bWList) {
        this.bWList = bWList == null ? null : bWList.trim();
    }

    public String getStopped() {
        return stopped;
    }

    public void setStopped(String stopped) {
        this.stopped = stopped == null ? null : stopped.trim();
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
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

    public Date getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(Date registrationTime) {
        this.registrationTime = registrationTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getProp1() {
        return prop1;
    }

    public void setProp1(String prop1) {
        this.prop1 = prop1 == null ? null : prop1.trim();
    }

    public String getProp2() {
        return prop2;
    }

    public void setProp2(String prop2) {
        this.prop2 = prop2 == null ? null : prop2.trim();
    }

    public String getProp3() {
        return prop3;
    }

    public void setProp3(String prop3) {
        this.prop3 = prop3 == null ? null : prop3.trim();
    }

    public String getProp4() {
        return prop4;
    }

    public void setProp4(String prop4) {
        this.prop4 = prop4 == null ? null : prop4.trim();
    }

    public String getProp5() {
        return prop5;
    }

    public void setProp5(String prop5) {
        this.prop5 = prop5 == null ? null : prop5.trim();
    }

    public String getProp6() {
        return prop6;
    }

    public void setProp6(String prop6) {
        this.prop6 = prop6 == null ? null : prop6.trim();
    }

    public String getSectorName() {
        return sectorName;
    }

    public void setSectorName(String sectorName) {
        this.sectorName = sectorName == null ? null : sectorName.trim();
    }

    public String getOrganizName() {
        return organizName;
    }

    public void setOrganizName(String organizName) {
        this.organizName = organizName == null ? null : organizName.trim();
    }

    public Date getLoadTime() {
        return loadTime;
    }

    public void setLoadTime(Date loadTime) {
        this.loadTime = loadTime;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", customerType=").append(customerType);
        sb.append(", customerPlatformType=").append(customerPlatformType);
        sb.append(", customerNo=").append(customerNo);
        sb.append(", customerName=").append(customerName);
        sb.append(", buyerNick=").append(buyerNick);
        sb.append(", gender=").append(gender);
        sb.append(", country=").append(country);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", district=").append(district);
        sb.append(", address=").append(address);
        sb.append(", zip=").append(zip);
        sb.append(", telno=").append(telno);
        sb.append(", mobile=").append(mobile);
        sb.append(", img=").append(img);
        sb.append(", email=").append(email);
        sb.append(", qq=").append(qq);
        sb.append(", wechat=").append(wechat);
        sb.append(", birthday=").append(birthday);
        sb.append(", lastPurchaseTime=").append(lastPurchaseTime);
        sb.append(", label=").append(label);
        sb.append(", bWList=").append(bWList);
        sb.append(", stopped=").append(stopped);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", loginPlace=").append(loginPlace);
        sb.append(", loginBrowser=").append(loginBrowser);
        sb.append(", loginIp=").append(loginIp);
        sb.append(", registrationTime=").append(registrationTime);
        sb.append(", remark=").append(remark);
        sb.append(", prop1=").append(prop1);
        sb.append(", prop2=").append(prop2);
        sb.append(", prop3=").append(prop3);
        sb.append(", prop4=").append(prop4);
        sb.append(", prop5=").append(prop5);
        sb.append(", prop6=").append(prop6);
        sb.append(", sectorName=").append(sectorName);
        sb.append(", organizName=").append(organizName);
        sb.append(", loadTime=").append(loadTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}