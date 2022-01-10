package com.runone.pinda.mbg.mapper;

import com.runone.pinda.mbg.model.DTenant;
import com.runone.pinda.mbg.model.DTenantExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DTenantMapper {
    long countByExample(DTenantExample example);

    int deleteByExample(DTenantExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DTenant record);

    int insertSelective(DTenant record);

    List<DTenant> selectByExample(DTenantExample example);

    DTenant selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DTenant record, @Param("example") DTenantExample example);

    int updateByExample(@Param("record") DTenant record, @Param("example") DTenantExample example);

    int updateByPrimaryKeySelective(DTenant record);

    int updateByPrimaryKey(DTenant record);
}