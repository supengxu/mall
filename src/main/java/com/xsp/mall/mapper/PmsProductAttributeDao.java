package com.xsp.mall.mapper;

import com.xsp.mall.dto.ProductAttrInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

/**
 * 自定义商品属性Dao
 * Created by xsp on 2018/5/23.
 */
public interface PmsProductAttributeDao {
    List<ProductAttrInfo> getProductAttrInfo(@Param("id") Long productCategoryId);
}
