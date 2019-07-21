package com.xsp.mall.mapper;

import com.xsp.mall.model.pojo.CmsTopicComment;
import com.xsp.mall.model.pojo.CmsTopicCommentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CmsTopicCommentMapper {
    long countByExample(CmsTopicCommentExample example);

    int deleteByExample(CmsTopicCommentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmsTopicComment record);

    int insertSelective(CmsTopicComment record);

    List<CmsTopicComment> selectByExample(CmsTopicCommentExample example);

    CmsTopicComment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmsTopicComment record, @Param("example") CmsTopicCommentExample example);

    int updateByExample(@Param("record") CmsTopicComment record, @Param("example") CmsTopicCommentExample example);

    int updateByPrimaryKeySelective(CmsTopicComment record);

    int updateByPrimaryKey(CmsTopicComment record);
}