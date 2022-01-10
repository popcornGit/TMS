package com.runone.pinda.mbg.mapper;

import com.runone.pinda.mbg.model.PdTruckDriverLicense;
import com.runone.pinda.mbg.model.PdTruckDriverLicenseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PdTruckDriverLicenseMapper {
    long countByExample(PdTruckDriverLicenseExample example);

    int deleteByExample(PdTruckDriverLicenseExample example);

    int deleteByPrimaryKey(String id);

    int insert(PdTruckDriverLicense record);

    int insertSelective(PdTruckDriverLicense record);

    List<PdTruckDriverLicense> selectByExample(PdTruckDriverLicenseExample example);

    PdTruckDriverLicense selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PdTruckDriverLicense record, @Param("example") PdTruckDriverLicenseExample example);

    int updateByExample(@Param("record") PdTruckDriverLicense record, @Param("example") PdTruckDriverLicenseExample example);

    int updateByPrimaryKeySelective(PdTruckDriverLicense record);

    int updateByPrimaryKey(PdTruckDriverLicense record);
}