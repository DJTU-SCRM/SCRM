package com.example.scrm.dictionaryDetails.dao;

import com.example.scrm.dictionaryDetails.entity.DictionaryDetails;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component(value = "DictionaryDetailsDao")
public interface DictionaryDetailsDao {

    int deleteByPrimaryKey(String customerType);

    int insert(DictionaryDetails record);

    int insertSelective(DictionaryDetails record);

    List<DictionaryDetails> selectByDictionaryDetails(DictionaryDetails dictionaryDetails);

    DictionaryDetails selectByPrimaryKey(String customerType);

    int updateByPrimaryKeySelective(DictionaryDetails record);

    int updateByPrimaryKey(DictionaryDetails record);
}