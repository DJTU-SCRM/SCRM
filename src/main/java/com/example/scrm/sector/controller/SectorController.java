package com.example.scrm.sector.controller;

import com.example.scrm.sector.entity.Sector;
import com.example.scrm.sector.service.SectorService;
import com.example.scrm.util.response.AppResponse;
import com.example.scrm.util.response.AppResponseStatus;
import com.example.scrm.util.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


/**
 * TODO
 *
 * @author zty
 * @version 1.0
 * @date 2021/10/3 16:21
 */

@RestController
public class SectorController {
    @Autowired
    SectorService sectorService;

    //更新部门信息，所传属性名与Sector类中属性名称一致
    @RequestMapping("/backend/sector/updateSector")
    public AppResponse updateSector(Sector record) {
        int updateNumber=sectorService.updateByPrimaryKey(record);
        if (updateNumber==1){
            return AppResponse.success("更新成功");
        }
        return AppResponse.bizError("更新失败");
    }

    //创建新部门信息，所传属性名与Sector类中属性名称一致
    @RequestMapping("/backend//sector/addSector")
    public AppResponse addSector(Sector record,@RequestParam("organizName") String organizName) {
        //为部门号SectorNo，赋予唯一UUID
        record.setSectorNo(UUIDUtil.uuidStr());
        //创建时间
        Date date = new Date();
        DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(format.format(date));
        String timeNow= format.format(date);
        record.setGmtCreate(timeNow);

        int insertNumber=sectorService.insert(record,organizName);
        if (insertNumber==1){
            return AppResponse.success("创建成功");
        }
        return AppResponse.bizError("创建失败");

    }

    //根据部门号删除部门信息
    @RequestMapping("/backend/sector/deleteSector")
    public AppResponse deleteSector(@PathVariable("sectorNo") String sectorNo) {
        int deleteNumber=sectorService.deleteByPrimaryKey(sectorNo);
        if (deleteNumber==1){
            return AppResponse.success("删除成功");
        }
        return AppResponse.bizError("删除失败");
    }
/*


 */
    //查看所有部门信息
    @RequestMapping("/backend/sector/selectAllSector")
    public AppResponse selectAllSector() {
            List<Sector> sectors=sectorService.selectAllSector();
        return AppResponse.success("查询成功",sectors);
    }

    //查看某组织下所有部门信息
    @RequestMapping("/backend/sector/selectAllSectorByOrganization")
    public AppResponse selectAllSectorByOrganization(@PathVariable("organizName") String organizName) {
        List<Sector> sectors=sectorService.selectByOrganization(organizName);
        return AppResponse.success("查询成功",sectors);
    }

    //查看某一部门信息
    @RequestMapping("/backend//sector/selectSector")
    public AppResponse selectSectorByOrganization(@PathVariable("sectorNo") String sectorNo) {
        Sector sector=sectorService.selectSector(sectorNo);
        return AppResponse.success("查询成功",sector);
    }
}
