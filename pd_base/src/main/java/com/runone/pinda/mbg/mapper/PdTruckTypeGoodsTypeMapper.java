package com.runone.pinda.mbg.mapper;

import com.runone.pinda.mbg.model.PdTruckTypeGoodsType;
import com.runone.pinda.mbg.model.PdTruckTypeGoodsTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PdTruckTypeGoodsTypeMapper {
    long countByExample(PdTruckTypeGoodsTypeExample example);

    int deleteByExample(PdTruckTypeGoodsTypeExample example);

    int deleteByPrimaryKey(String id);

    int insert(PdTruckTypeGoodsType record);

    int insertSelective(PdTruckTypeGoodsType record);

    List<PdTruckTypeGoodsType> selectByExample(PdTruckTypeGoodsTypeExample example);

    PdTruckTypeGoodsType selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PdTruckTypeGoodsType record, @Param("example") PdTruckTypeGoodsTypeExample example);

    int updateByExample(@Param("record") PdTruckTypeGoodsType record, @Param("example") PdTruckTypeGoodsTypeExample example);

    int updateByPrimaryKeySelective(PdTruckTypeGoodsType record);

    int updateByPrimaryKey(PdTruckTypeGoodsType record);
}