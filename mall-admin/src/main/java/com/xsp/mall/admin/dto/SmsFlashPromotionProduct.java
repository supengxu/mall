package com.xsp.mall.admin.dto;

import com.xsp.mall.admin.pojo.PmsProduct;
import com.xsp.mall.admin.pojo.SmsFlashPromotionProductRelation;
import lombok.Getter;
import lombok.Setter;

/**
 * 限时购及商品信息封装
 * Created by xsp on 2018/11/16.
 */
public class SmsFlashPromotionProduct extends SmsFlashPromotionProductRelation {
    @Getter
    @Setter
    private PmsProduct product;
}
