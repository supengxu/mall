package com.xsp.mall.service.impl;

import com.xsp.mall.dto.PmsProductCategoryParam;
import com.xsp.mall.dto.PmsProductCategoryWithChildrenItem;
import com.xsp.mall.pojo.PmsProductCategory;
import com.xsp.mall.service.PmsProductCategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PmsProductCategoryServiceImpl implements PmsProductCategoryService {
    @Override
    public int create(PmsProductCategoryParam pmsProductCategoryParam) {
        return 0;
    }

    @Override
    public int update(Long id, PmsProductCategoryParam pmsProductCategoryParam) {
        return 0;
    }

    @Override
    public List<PmsProductCategory> getList(Long parentId, Integer pageSize, Integer pageNum) {
        return null;
    }

    @Override
    public int delete(Long id) {
        return 0;
    }

    @Override
    public PmsProductCategory getItem(Long id) {
        return null;
    }

    @Override
    public int updateNavStatus(List<Long> ids, Integer navStatus) {
        return 0;
    }

    @Override
    public int updateShowStatus(List<Long> ids, Integer showStatus) {
        return 0;
    }

    @Override
    public List<PmsProductCategoryWithChildrenItem> listWithChildren() {
        return null;
    }
}
