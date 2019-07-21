package com.xsp.mall.admin.dto;

import com.xsp.mall.model.SmsCoupon;
import com.xsp.mall.model.SmsCouponProductCategoryRelation;
import com.xsp.mall.model.SmsCouponProductRelation;
import lombok.Setter;

import java.util.List;

/**
 * 优惠券信息封装，包括绑定商品和绑定分类
 * Created by xsp on 2018/8/28.
 */
@Setter
public class SmsCouponParam extends SmsCoupon {
    //优惠券绑定的商品
    private List<SmsCouponProductRelation> productRelationList;
    //优惠券绑定的商品分类
    private List<SmsCouponProductCategoryRelation> productCategoryRelationList;

    public List<SmsCouponProductRelation> getProductRelationList() {
        return productRelationList;
    }

}
