package com.xsp.mall.frontend.dto;

import com.xsp.mall.model.SmsCoupon;
import com.xsp.mall.model.SmsCouponHistory;
import com.xsp.mall.model.SmsCouponProductCategoryRelation;
import com.xsp.mall.model.SmsCouponProductRelation;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 优惠券领取历史详情封装
 * Created by xsp on 2018/8/29.
 */
@Getter
@Setter
public class SmsCouponHistoryDetail extends SmsCouponHistory {
    //相关优惠券信息
    private SmsCoupon coupon;
    //优惠券关联商品
    private List<SmsCouponProductRelation> productRelationList;
    //优惠券关联商品分类
    private List<SmsCouponProductCategoryRelation> categoryRelationList;
}
