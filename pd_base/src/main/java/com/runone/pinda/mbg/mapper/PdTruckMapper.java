package com.runone.pinda.mbg.mapper;

import com.runone.pinda.mbg.model.PdTruck;
import com.runone.pinda.mbg.model.PdTruckExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PdTruckMapper {
    long countByExample(PdTruckExample example);

    int deleteByExample(PdTruckExample example);

    int deleteByPrimaryKey(String id);

    int insert(PdTruck record);

    int insertSelective(PdTruck record);

    List<PdTruck> selectByExample(PdTruckExample example);

    PdTruck selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PdTruck record, @Param("example") PdTruckExample example);

    int updateByExample(@Param("record") PdTruck record, @Param("example") PdTruckExample example);

    int updateByPrimaryKeySelective(PdTruck record);

    int updateByPrimaryKey(PdTruck record);
}