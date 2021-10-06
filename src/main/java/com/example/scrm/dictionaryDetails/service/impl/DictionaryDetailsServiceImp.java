package com.example.scrm.dictionaryDetails.service.impl;

import com.example.scrm.dictionaryDetails.dao.DictionaryDetailsDao;
import com.example.scrm.dictionaryDetails.entity.DictionaryDetails;
import com.example.scrm.dictionaryDetails.service.DictionaryDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * serviceImp层
 *
 * @author Steven
 * @version 1.0
 * @date 2021/10/3 16:23
 *
 *  @author 孙少聪
 *  @version 2.0
 *  @date 2021/10/5 21:23
 */
@Service
public class DictionaryDetailsServiceImp implements DictionaryDetailsService {

    @Autowired
    private DictionaryDetailsDao dictionaryDetailsDao;

    @Override
    public int deleteByPrimaryKey(String customerType) {
        return dictionaryDetailsDao.deleteByPrimaryKey(customerType);
    }

    @Override
    public int insert(DictionaryDetails record) {
        return dictionaryDetailsDao.insert(record);
    }

    @Override
    public int insertSelective(DictionaryDetails record) {
        return dictionaryDetailsDao.insertSelective(record);
    }

    @Override
    public DictionaryDetails selectByPrimaryKey(String customerType) {
        return dictionaryDetailsDao.selectByPrimaryKey(customerType);
    }

    @Override
    public List<DictionaryDetails> selectByDictionaryDetails(DictionaryDetails dictionaryDetails) {
        return dictionaryDetailsDao.selectByDictionaryDetails(dictionaryDetails);
    }

    @Override
    public int updateByPrimaryKeySelective(DictionaryDetails record) {
        return dictionaryDetailsDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(DictionaryDetails record) {
        return dictionaryDetailsDao.updateByPrimaryKey(record);
    }
}
