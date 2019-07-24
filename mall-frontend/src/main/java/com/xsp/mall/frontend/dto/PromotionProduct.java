package com.xsp.mall.frontend.dto;

import com.xsp.mall.model.PmsProduct;
import com.xsp.mall.model.PmsProductFullReduction;
import com.xsp.mall.model.PmsProductLadder;
import com.xsp.mall.model.PmsSkuStock;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by xsp on 2018/8/27.
 * 商品的促销信息，包括sku、打折优惠、满减优惠
 */
@Getter
@Setter
public class PromotionProduct extends PmsProduct {
    //商品库存信息
    private List<PmsSkuStock> skuStockList;
    //商品打折信息
    private List<PmsProductLadder> productLadderList;
    //商品满减信息
    private List<PmsProductFullReduction> productFullReductionList;

}
