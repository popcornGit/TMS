package com.runone.pinda.mbg.mapper;

import com.runone.pinda.mbg.model.PdCourierScop;
import com.runone.pinda.mbg.model.PdCourierScopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PdCourierScopMapper {
    long countByExample(PdCourierScopExample example);

    int deleteByExample(PdCourierScopExample example);

    int deleteByPrimaryKey(String id);

    int insert(PdCourierScop record);

    int insertSelective(PdCourierScop record);

    List<PdCourierScop> selectByExampleWithBLOBs(PdCourierScopExample example);

    List<PdCourierScop> selectByExample(PdCourierScopExample example);

    PdCourierScop selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PdCourierScop record, @Param("example") PdCourierScopExample example);

    int updateByExampleWithBLOBs(@Param("record") PdCourierScop record, @Param("example") PdCourierScopExample example);

    int updateByExample(@Param("record") PdCourierScop record, @Param("example") PdCourierScopExample example);

    int updateByPrimaryKeySelective(PdCourierScop record);

    int updateByPrimaryKeyWithBLOBs(PdCourierScop record);

    int updateByPrimaryKey(PdCourierScop record);
}