package com.runone.pinda.mbg.mapper;

import com.runone.pinda.mbg.model.PdAgencyScope;
import com.runone.pinda.mbg.model.PdAgencyScopeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PdAgencyScopeMapper {
    long countByExample(PdAgencyScopeExample example);

    int deleteByExample(PdAgencyScopeExample example);

    int deleteByPrimaryKey(String id);

    int insert(PdAgencyScope record);

    int insertSelective(PdAgencyScope record);

    List<PdAgencyScope> selectByExampleWithBLOBs(PdAgencyScopeExample example);

    List<PdAgencyScope> selectByExample(PdAgencyScopeExample example);

    PdAgencyScope selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PdAgencyScope record, @Param("example") PdAgencyScopeExample example);

    int updateByExampleWithBLOBs(@Param("record") PdAgencyScope record, @Param("example") PdAgencyScopeExample example);

    int updateByExample(@Param("record") PdAgencyScope record, @Param("example") PdAgencyScopeExample example);

    int updateByPrimaryKeySelective(PdAgencyScope record);

    int updateByPrimaryKeyWithBLOBs(PdAgencyScope record);

    int updateByPrimaryKey(PdAgencyScope record);
}