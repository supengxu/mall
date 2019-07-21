package com.xsp.mall.admin.dto;

import com.xsp.mall.model.PmsProductCategory;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by xsp on 2018/5/25.
 */
public class PmsProductCategoryWithChildrenItem extends PmsProductCategory {
    @Getter
    @Setter
    private List<PmsProductCategory> children;
}
