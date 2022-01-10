package com.runone.pinda.mbg.mapper;

import com.runone.pinda.mbg.model.PdTransportLineType;
import com.runone.pinda.mbg.model.PdTransportLineTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PdTransportLineTypeMapper {
    long countByExample(PdTransportLineTypeExample example);

    int deleteByExample(PdTransportLineTypeExample example);

    int deleteByPrimaryKey(String id);

    int insert(PdTransportLineType record);

    int insertSelective(PdTransportLineType record);

    List<PdTransportLineType> selectByExample(PdTransportLineTypeExample example);

    PdTransportLineType selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PdTransportLineType record, @Param("example") PdTransportLineTypeExample example);

    int updateByExample(@Param("record") PdTransportLineType record, @Param("example") PdTransportLineTypeExample example);

    int updateByPrimaryKeySelective(PdTransportLineType record);

    int updateByPrimaryKey(PdTransportLineType record);
}