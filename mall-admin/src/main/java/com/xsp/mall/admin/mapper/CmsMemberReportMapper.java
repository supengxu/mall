package com.xsp.mall.admin.mapper;

import com.xsp.mall.admin.pojo.CmsMemberReport;
import com.xsp.mall.admin.pojo.CmsMemberReportExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CmsMemberReportMapper {
    long countByExample(CmsMemberReportExample example);

    int deleteByExample(CmsMemberReportExample example);

    int insert(CmsMemberReport record);

    int insertSelective(CmsMemberReport record);

    List<CmsMemberReport> selectByExample(CmsMemberReportExample example);

    int updateByExampleSelective(@Param("record") CmsMemberReport record, @Param("example") CmsMemberReportExample example);

    int updateByExample(@Param("record") CmsMemberReport record, @Param("example") CmsMemberReportExample example);
}