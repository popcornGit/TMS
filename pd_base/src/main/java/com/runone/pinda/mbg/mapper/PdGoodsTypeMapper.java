package com.runone.pinda.mbg.mapper;

import com.runone.pinda.mbg.model.PdGoodsType;
import com.runone.pinda.mbg.model.PdGoodsTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PdGoodsTypeMapper {
    long countByExample(PdGoodsTypeExample example);

    int deleteByExample(PdGoodsTypeExample example);

    int deleteByPrimaryKey(String id);

    int insert(PdGoodsType record);

    int insertSelective(PdGoodsType record);

    List<PdGoodsType> selectByExampleWithBLOBs(PdGoodsTypeExample example);

    List<PdGoodsType> selectByExample(PdGoodsTypeExample example);

    PdGoodsType selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PdGoodsType record, @Param("example") PdGoodsTypeExample example);

    int updateByExampleWithBLOBs(@Param("record") PdGoodsType record, @Param("example") PdGoodsTypeExample example);

    int updateByExample(@Param("record") PdGoodsType record, @Param("example") PdGoodsTypeExample example);

    int updateByPrimaryKeySelective(PdGoodsType record);

    int updateByPrimaryKeyWithBLOBs(PdGoodsType record);

    int updateByPrimaryKey(PdGoodsType record);
}