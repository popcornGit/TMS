package com.runone.pinda.mbg.mapper;

import com.runone.pinda.mbg.model.DGlobalUser;
import com.runone.pinda.mbg.model.DGlobalUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DGlobalUserMapper {
    long countByExample(DGlobalUserExample example);

    int deleteByExample(DGlobalUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DGlobalUser record);

    int insertSelective(DGlobalUser record);

    List<DGlobalUser> selectByExample(DGlobalUserExample example);

    DGlobalUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DGlobalUser record, @Param("example") DGlobalUserExample example);

    int updateByExample(@Param("record") DGlobalUser record, @Param("example") DGlobalUserExample example);

    int updateByPrimaryKeySelective(DGlobalUser record);

    int updateByPrimaryKey(DGlobalUser record);
}