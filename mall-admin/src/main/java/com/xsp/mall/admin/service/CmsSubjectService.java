package com.xsp.mall.admin.service;

import com.xsp.mall.admin.pojo.CmsSubject;

import java.util.List;

/**
 * 商品专题Service
 * Created by xsp on 2018/6/1.
 */
public interface CmsSubjectService {
    /**
     * 查询所有专题
     */
    List<CmsSubject> listAll();

    /**
     * 分页查询专题
     */
    List<CmsSubject> list(String keyword, Integer pageNum, Integer pageSize);
}
