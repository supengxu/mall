package com.xsp.mall.admin.dto;

import com.xsp.mall.model.*;
import com.xsp.mall.*;


import java.util.List;

/**
 * 创建和修改商品时使用的参数
 * Created by xsp on 2018/4/26.
 */
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

    public void setProductLadderList(List<PmsProductLadder> productLadderList) {
        this.productLadderList = productLadderList;
    }

    public List<PmsProductFullReduction> getProductFullReductionList() {
        return productFullReductionList;
    }

    public void setProductFullReductionList(List<PmsProductFullReduction> productFullReductionList) {
        this.productFullReductionList = productFullReductionList;
    }

    public List<PmsMemberPrice> getMemberPriceList() {
        return memberPriceList;
    }

    public void setMemberPriceList(List<PmsMemberPrice> memberPriceList) {
        this.memberPriceList = memberPriceList;
    }

    public List<PmsSkuStock> getSkuStockList() {
        return skuStockList;
    }

    public void setSkuStockList(List<PmsSkuStock> skuStockList) {
        this.skuStockList = skuStockList;
    }

    public List<PmsProductAttributeValue> getProductAttributeValueList() {
        return productAttributeValueList;
    }

    public void setProductAttributeValueList(List<PmsProductAttributeValue> productAttributeValueList) {
        this.productAttributeValueList = productAttributeValueList;
    }

    public List<CmsSubjectProductRelation> getSubjectProductRelationList() {
        return subjectProductRelationList;
    }

    public void setSubjectProductRelationList(List<CmsSubjectProductRelation> subjectProductRelationList) {
        this.subjectProductRelationList = subjectProductRelationList;
    }

    public List<CmsPrefrenceAreaProductRelation> getPrefrenceAreaProductRelationList() {
        return prefrenceAreaProductRelationList;
    }

    public void setPrefrenceAreaProductRelationList(List<CmsPrefrenceAreaProductRelation> prefrenceAreaProductRelationList) {
        this.prefrenceAreaProductRelationList = prefrenceAreaProductRelationList;
    }
}
