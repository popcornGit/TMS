package com.runone.pinda.mbg.mapper;

import com.runone.pinda.mbg.model.PdTransportTripsTruckDriver;
import com.runone.pinda.mbg.model.PdTransportTripsTruckDriverExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PdTransportTripsTruckDriverMapper {
    long countByExample(PdTransportTripsTruckDriverExample example);

    int deleteByExample(PdTransportTripsTruckDriverExample example);

    int deleteByPrimaryKey(String id);

    int insert(PdTransportTripsTruckDriver record);

    int insertSelective(PdTransportTripsTruckDriver record);

    List<PdTransportTripsTruckDriver> selectByExample(PdTransportTripsTruckDriverExample example);

    PdTransportTripsTruckDriver selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PdTransportTripsTruckDriver record, @Param("example") PdTransportTripsTruckDriverExample example);

    int updateByExample(@Param("record") PdTransportTripsTruckDriver record, @Param("example") PdTransportTripsTruckDriverExample example);

    int updateByPrimaryKeySelective(PdTransportTripsTruckDriver record);

    int updateByPrimaryKey(PdTransportTripsTruckDriver record);
}