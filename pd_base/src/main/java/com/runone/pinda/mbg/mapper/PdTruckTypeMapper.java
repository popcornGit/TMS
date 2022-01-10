package com.runone.pinda.mbg.mapper;

import com.runone.pinda.mbg.model.PdTruckType;
import com.runone.pinda.mbg.model.PdTruckTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PdTruckTypeMapper {
    long countByExample(PdTruckTypeExample example);

    int deleteByExample(PdTruckTypeExample example);

    int deleteByPrimaryKey(String id);

    int insert(PdTruckType record);

    int insertSelective(PdTruckType record);

    List<PdTruckType> selectByExample(PdTruckTypeExample example);

    PdTruckType selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PdTruckType record, @Param("example") PdTruckTypeExample example);

    int updateByExample(@Param("record") PdTruckType record, @Param("example") PdTruckTypeExample example);

    int updateByPrimaryKeySelective(PdTruckType record);

    int updateByPrimaryKey(PdTruckType record);
}