package com.xsp.mall.admin.dao;

import com.xsp.mall.admin.dto.ProductAttrInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 自定义商品属性Dao
 * Created by xsp on 2018/5/23.
 */
public interface PmsProductAttributeDao {
    List<ProductAttrInfo> getProductAttrInfo(@Param("id") Long productCategoryId);
}
