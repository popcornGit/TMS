package com.runone.pinda.mbg.mapper;

import com.runone.pinda.mbg.model.PdTruckDriver;
import com.runone.pinda.mbg.model.PdTruckDriverExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PdTruckDriverMapper {
    long countByExample(PdTruckDriverExample example);

    int deleteByExample(PdTruckDriverExample example);

    int deleteByPrimaryKey(String id);

    int insert(PdTruckDriver record);

    int insertSelective(PdTruckDriver record);

    List<PdTruckDriver> selectByExample(PdTruckDriverExample example);

    PdTruckDriver selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PdTruckDriver record, @Param("example") PdTruckDriverExample example);

    int updateByExample(@Param("record") PdTruckDriver record, @Param("example") PdTruckDriverExample example);

    int updateByPrimaryKeySelective(PdTruckDriver record);

    int updateByPrimaryKey(PdTruckDriver record);
}