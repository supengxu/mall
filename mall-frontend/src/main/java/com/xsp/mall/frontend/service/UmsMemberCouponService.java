package com.xsp.mall.frontend.service;

import com.xsp.mall.frontend.dto.CartPromotionItem;
import com.xsp.mall.frontend.dto.SmsCouponHistoryDetail;
import com.xsp.mall.model.SmsCouponHistory;
import com.xsp.mall.result.CommonResult;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 用户优惠券管理Service
 * Created by xsp on 2018/8/29.
 */
public interface UmsMemberCouponService {
    /**
     * 会员添加优惠券
     */
    @Transactional
    CommonResult add(Long couponId);

    /**
     * 获取优惠券列表
     *
     * @param useStatus 优惠券的使用状态
     */
    List<SmsCouponHistory> list(Integer useStatus);

    /**
     * 根据购物车信息获取可用优惠券
     */
    List<SmsCouponHistoryDetail> listCart(List<CartPromotionItem> cartItemList, Integer type);
}
