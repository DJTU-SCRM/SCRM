package com.example.scrm.dictionaryDetails.controller;

import com.example.scrm.dictionaryDetails.entity.DictionaryDetails;
import com.example.scrm.dictionaryDetails.service.impl.DictionaryDetailsServiceImp;
import com.example.scrm.util.UUIDUtil;
import com.example.scrm.util.response.AppResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 字典管理
 *
 * @author Steven
 * @version 1.0
 * @date 2021/10/3 16:22
 */
@RequestMapping("/backend/dictionary")
@RestController
public class DictionaryDetailsController {
    @Autowired
    private DictionaryDetailsServiceImp dictionaryDetailsServiceImp;

    private DictionaryDetails dictionaryDetails;

    /**
     *
     * 查询所有的会员标签
     * @param dictionaryDetails
     * @author 孙少聪
     * @date  2021.10.05 21:42
     * @return com.example.scrm.util.response.AppResponse
     */
    @RequestMapping(value="selectDictionaryDetails")
    public AppResponse selectDictionaryDetails(DictionaryDetails dictionaryDetails) {

        return selectAllDictionaryDetailsList(dictionaryDetails);

    }

    /**
     *
     * 根据CustomerType查询会员标签
     * @param customerType
     * @author 孙少聪
     * @date 2021.10.05 21:43
     * @return com.example.scrm.util.response.AppResponse
     */
    @RequestMapping(value="selectDictionaryDetailsByCustomerType")
    public AppResponse selectDictionaryDetailsByCustomerType(String customerType) {

        DictionaryDetails dictionaryDetails = dictionaryDetailsServiceImp.selectByPrimaryKey(customerType);
        if(dictionaryDetails!=null){
            return AppResponse.success("dictionaryDetails", dictionaryDetails);
        }else{
            return AppResponse.notFound();
        }
    }

    /**
     *
     * 根据DictionaryDetails对象来更新会员标签
     * @param dictionaryDetails
     * @author 孙少聪
     * @date 2021.10.05 21:43
     * @return com.example.scrm.util.response.AppResponse
     */
    @RequestMapping(value="updateDictionaryDetail")
    public AppResponse updateOneDictionaryDetail(@RequestBody DictionaryDetails dictionaryDetails) {

        if(dictionaryDetails!=null){
            dictionaryDetailsServiceImp.updateByPrimaryKey(dictionaryDetails);
            DictionaryDetails dictionaryDetailsByCustomerType = dictionaryDetailsServiceImp.selectByPrimaryKey(dictionaryDetails.getCustomerType());
            return AppResponse.success("dictionaryDetailsByCustomerType", dictionaryDetailsByCustomerType);
        }else{
            return AppResponse.notFound();
        }
    }

    /**
     *
     * 根据CustomerType删除某条会员标签
     * @param customerType
     * @author 孙少聪
     * @date 2021.10.05 21:43
     * @return com.example.scrm.util.response.AppResponse
     */
    @RequestMapping(value="deleteDictionaryDetailsByCustomerType")
    public AppResponse delectOneDictionaryDetailsByCustomerType(String customerType) {
        dictionaryDetailsServiceImp.deleteByPrimaryKey(customerType);
        return selectAllDictionaryDetailsList(dictionaryDetails);
    }

    /**
     *
     * 根据DictionaryDetails对象来插入一条记录
     * @param dictionaryDetails
     * @author 孙少聪
     * @date 2021.10.05 21:44
     * @return com.example.scrm.util.response.AppResponse
     */
    @RequestMapping(value="insertDictionaryDetails")
    public AppResponse InsertCustomer(@RequestBody DictionaryDetails dictionaryDetails) {

        dictionaryDetailsServiceImp.insert(dictionaryDetails);
        return selectAllDictionaryDetailsList(dictionaryDetails);
    }

    /**
     *
     * 查询所有会员标签
     * @param dictionaryDetails
     * @author 孙少聪
     * @date 2021.10.05 21:44
     * @return com.example.scrm.util.response.AppResponse
     */
    private AppResponse selectAllDictionaryDetailsList(DictionaryDetails dictionaryDetails){
        List<DictionaryDetails> dictionaryDetailsList = dictionaryDetailsServiceImp.selectByDictionaryDetails(dictionaryDetails);
        if(dictionaryDetailsList!=null){
            return AppResponse.success("dictionaryDetailsList", dictionaryDetailsList);
        }else{
            return AppResponse.notFound();
        }
    }

}
