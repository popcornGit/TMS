package com.runone.pinda.mbg.mapper;

import com.runone.pinda.mbg.model.PdTransportTrips;
import com.runone.pinda.mbg.model.PdTransportTripsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PdTransportTripsMapper {
    long countByExample(PdTransportTripsExample example);

    int deleteByExample(PdTransportTripsExample example);

    int deleteByPrimaryKey(String id);

    int insert(PdTransportTrips record);

    int insertSelective(PdTransportTrips record);

    List<PdTransportTrips> selectByExample(PdTransportTripsExample example);

    PdTransportTrips selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PdTransportTrips record, @Param("example") PdTransportTripsExample example);

    int updateByExample(@Param("record") PdTransportTrips record, @Param("example") PdTransportTripsExample example);

    int updateByPrimaryKeySelective(PdTransportTrips record);

    int updateByPrimaryKey(PdTransportTrips record);
}