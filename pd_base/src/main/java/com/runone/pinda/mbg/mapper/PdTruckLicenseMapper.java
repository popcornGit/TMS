package com.runone.pinda.mbg.mapper;

import com.runone.pinda.mbg.model.PdTruckLicense;
import com.runone.pinda.mbg.model.PdTruckLicenseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PdTruckLicenseMapper {
    long countByExample(PdTruckLicenseExample example);

    int deleteByExample(PdTruckLicenseExample example);

    int deleteByPrimaryKey(String id);

    int insert(PdTruckLicense record);

    int insertSelective(PdTruckLicense record);

    List<PdTruckLicense> selectByExample(PdTruckLicenseExample example);

    PdTruckLicense selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PdTruckLicense record, @Param("example") PdTruckLicenseExample example);

    int updateByExample(@Param("record") PdTruckLicense record, @Param("example") PdTruckLicenseExample example);

    int updateByPrimaryKeySelective(PdTruckLicense record);

    int updateByPrimaryKey(PdTruckLicense record);
}