package com.xsp.mall.frontend.service.Impl;

import com.xsp.mall.frontend.service.HomeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeServiceImpl implements HomeService {
    @Override
    public HomeContentResult content() {
        return null;
    }

    @Override
    public List<PmsProduct> recommendProductList(Integer pageSize, Integer pageNum) {
        return null;
    }

    @Override
    public List<PmsProductCategory> getProductCateList(Long parentId) {
        return null;
    }

    @Override
    public List<CmsSubject> getSubjectList(Long cateId, Integer pageSize, Integer pageNum) {
        return null;
    }
}
