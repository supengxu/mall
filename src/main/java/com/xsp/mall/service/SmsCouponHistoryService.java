package com.xsp.mall.service;

import com.xsp.mall.pojo.SmsCouponHistory;

import java.util.List;

/**
 * 优惠券领取记录管理Service
 * Created by xsp on 2018/11/6.
 */
public interface SmsCouponHistoryService {
    /**
     * 分页查询优惠券领取记录
     * @param couponId 优惠券id
     * @param useStatus 使用状态
     * @param orderSn 使用订单号码
     */
    List<SmsCouponHistory> list(Long couponId, Integer useStatus, String orderSn, Integer pageSize, Integer pageNum);
}
