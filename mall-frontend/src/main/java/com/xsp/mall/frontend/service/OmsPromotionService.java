package com.xsp.mall.frontend.service;

import com.xsp.mall.model.OmsCartItem;
import com.xsp.mall.portal.domain.CartPromotionItem;

import java.util.List;

/**
 * Created by xsp on 2018/8/27.
 * 促销管理Service
 */
public interface OmsPromotionService {
    /**
     * 计算购物车中的促销活动信息
     * @param cartItemList 购物车
     */
    List<CartPromotionItem> calcCartPromotion(List<OmsCartItem> cartItemList);
}
