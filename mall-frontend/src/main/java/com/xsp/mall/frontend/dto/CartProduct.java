package com.xsp.mall.frontend.dto;

import com.xsp.mall.model.PmsProduct;
import com.xsp.mall.model.PmsProductAttribute;
import com.xsp.mall.model.PmsSkuStock;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 购物车中选择规格的商品信息
 * Created by xsp on 2018/8/2.
 */
@Getter
@Setter
public class CartProduct extends PmsProduct {
    private List<PmsProductAttribute> productAttributeList;
    private List<PmsSkuStock> skuStockList;
}
