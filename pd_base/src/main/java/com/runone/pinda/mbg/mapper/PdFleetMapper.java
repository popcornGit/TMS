package com.runone.pinda.mbg.mapper;

import com.runone.pinda.mbg.model.PdFleet;
import com.runone.pinda.mbg.model.PdFleetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PdFleetMapper {
    long countByExample(PdFleetExample example);

    int deleteByExample(PdFleetExample example);

    int deleteByPrimaryKey(String id);

    int insert(PdFleet record);

    int insertSelective(PdFleet record);

    List<PdFleet> selectByExample(PdFleetExample example);

    PdFleet selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PdFleet record, @Param("example") PdFleetExample example);

    int updateByExample(@Param("record") PdFleet record, @Param("example") PdFleetExample example);

    int updateByPrimaryKeySelective(PdFleet record);

    int updateByPrimaryKey(PdFleet record);
}