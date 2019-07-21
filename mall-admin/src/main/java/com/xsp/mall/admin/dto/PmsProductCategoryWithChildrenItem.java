package com.xsp.mall.admin.dto;

import com.xsp.mall.model.PmsProductCategory;

import java.util.List;

/**
 * Created by xsp on 2018/5/25.
 */
public class PmsProductCategoryWithChildrenItem extends PmsProductCategory {
    private List<PmsProductCategory> children;

    public List<PmsProductCategory> getChildren() {
        return children;
    }

    public void setChildren(List<PmsProductCategory> children) {
        this.children = children;
    }
}
