package com.example.scrm.dictionaryDetails.service;

import com.example.scrm.dictionaryDetails.entity.DictionaryDetails;

import java.util.List;

public interface DictionaryDetailsService {

    int deleteByPrimaryKey(String customerType);

    int insert(DictionaryDetails record);

    int insertSelective(DictionaryDetails record);

    DictionaryDetails selectByPrimaryKey(String customerType);

    List<DictionaryDetails> selectByDictionaryDetails(DictionaryDetails dictionaryDetails);

    int updateByPrimaryKeySelective(DictionaryDetails record);

    int updateByPrimaryKey(DictionaryDetails record);
}
