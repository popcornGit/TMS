package com.runone.pinda.mbg.mapper;

import com.runone.pinda.mbg.model.PdTransportLine;
import com.runone.pinda.mbg.model.PdTransportLineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PdTransportLineMapper {
    long countByExample(PdTransportLineExample example);

    int deleteByExample(PdTransportLineExample example);

    int deleteByPrimaryKey(String id);

    int insert(PdTransportLine record);

    int insertSelective(PdTransportLine record);

    List<PdTransportLine> selectByExample(PdTransportLineExample example);

    PdTransportLine selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PdTransportLine record, @Param("example") PdTransportLineExample example);

    int updateByExample(@Param("record") PdTransportLine record, @Param("example") PdTransportLineExample example);

    int updateByPrimaryKeySelective(PdTransportLine record);

    int updateByPrimaryKey(PdTransportLine record);
}