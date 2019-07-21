package com.xsp.mall.admin.dto;

import com.xsp.mall.model.*;
import com.xsp.mall.*;
import lombok.Getter;
import lombok.Setter;


import java.util.List;

/**
 * 创建和修改商品时使用的参数
 * Created by xsp on 2018/4/26.
 */
@Getter
@Setter
public class PmsProductParam extends PmsProduct {
    // "商品阶梯价格设置")
    private List<PmsProductLadder> productLadderList;
    // "商品满减价格设置")
    private List<PmsProductFullReduction> productFullReductionList;
    // "商品会员价格设置")
    private List<PmsMemberPrice> memberPriceList;
    // "商品的sku库存信息")
    private List<PmsSkuStock> skuStockList;
    // "商品参数及自定义规格属性")
    private List<PmsProductAttributeValue> productAttributeValueList;
    // "专题和商品关系")
    private List<CmsSubjectProductRelation> subjectProductRelationList;
    // "优选专区和商品的关系")
    private List<CmsPrefrenceAreaProductRelation> prefrenceAreaProductRelationList;

    public List<PmsProductLadder> getProductLadderList() {
        return productLadderList;
    }
}
