package com.example.scrm.organization.controller;

import com.example.scrm.organization.entity.Organization;
import com.example.scrm.organization.service.OrganizationService;

import com.example.scrm.util.UUIDUtil;
import com.example.scrm.util.response.AppResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * TODO
 *
 * @author zty
 * @version 1.0
 * @date 2021/10/5 10:20
 */
@RestController
public class OrganizationController {
    @Autowired
    OrganizationService organizationService;

    //创建新组织信息，所传属性名与Organization类中属性名称一致
    @RequestMapping("/backend/organiz/addOrganiz")
    public AppResponse addOrganiz(Organization record) {
        //为组织号SectorNo，赋予唯一UUID
        record.setOrganizNo(UUIDUtil.uuidStr());
        //创建时间
        Date date = new Date();
        DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(format.format(date));
        String timeNow= format.format(date);
        record.setGmtCreate(timeNow);
        int insertNumber=organizationService.insert(record);
        if (insertNumber==1){
            return AppResponse.success("组织创建成功");
        }
        return AppResponse.bizError("插入失败");
    }

    //根据组织名删除组织信息，并删除该组织下所有部门信息
    @RequestMapping("/backend/organiz/deleteOrganiz")
    public AppResponse deleteOrganiz(@RequestParam("organizName") String organizName) {
        int deleteNumber=organizationService.deleteByPrimaryKey(organizName);
        if (deleteNumber==1){
            return AppResponse.success("删除成功");
        }
        return AppResponse.bizError("删除成功");
    }

    //修改组织信息，(参数中必须含有组织UUID)所传属性名与Organization类中属性名称一致
    @RequestMapping("/backend/organiz/updateOrganiz")
    public AppResponse updateOrganiz(Organization record) {

        int updateNumber=organizationService.updateByPrimaryKey(record);
        if (updateNumber==1){
            return AppResponse.success("修改成功");
        }
        return AppResponse.bizError("修改成功");
    }

    //查询所有组织信息（有bug,返回列表为null）
    @RequestMapping("/backend/organiz/selectOrganiz")
    public AppResponse  selectOrganiz() {

        List<Organization> organizations=organizationService.selectAllOrganization();

        return AppResponse.success("organizations",organizations);

    }
}
