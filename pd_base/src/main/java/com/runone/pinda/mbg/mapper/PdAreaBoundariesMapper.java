package com.runone.pinda.mbg.mapper;

import com.runone.pinda.mbg.model.PdAreaBoundaries;
import com.runone.pinda.mbg.model.PdAreaBoundariesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PdAreaBoundariesMapper {
    long countByExample(PdAreaBoundariesExample example);

    int deleteByExample(PdAreaBoundariesExample example);

    int deleteByPrimaryKey(String id);

    int insert(PdAreaBoundaries record);

    int insertSelective(PdAreaBoundaries record);

    List<PdAreaBoundaries> selectByExampleWithBLOBs(PdAreaBoundariesExample example);

    List<PdAreaBoundaries> selectByExample(PdAreaBoundariesExample example);

    PdAreaBoundaries selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PdAreaBoundaries record, @Param("example") PdAreaBoundariesExample example);

    int updateByExampleWithBLOBs(@Param("record") PdAreaBoundaries record, @Param("example") PdAreaBoundariesExample example);

    int updateByExample(@Param("record") PdAreaBoundaries record, @Param("example") PdAreaBoundariesExample example);

    int updateByPrimaryKeySelective(PdAreaBoundaries record);

    int updateByPrimaryKeyWithBLOBs(PdAreaBoundaries record);

    int updateByPrimaryKey(PdAreaBoundaries record);
}