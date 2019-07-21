package com.xsp.mall.admin.dto;

import com.xsp.mall.model.PmsProductAttribute;
import com.xsp.mall.model.PmsProductAttributeCategory;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 包含有分类下属性的dto
 * Created by xsp on 2018/5/24.
 */
public class PmsProductAttributeCategoryItem extends PmsProductAttributeCategory {
    @Getter
    @Setter
    private List<PmsProductAttribute> productAttributeList;
}
