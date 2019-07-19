package com.xsp.mall.admin.service;

import com.xsp.mall.admin.pojo.OmsOrderSetting;

/**
 * 订单设置Service
 * Created by xsp on 2018/10/16.
 */
public interface OmsOrderSettingService {
    /**
     * 获取指定订单设置
     */
    OmsOrderSetting getItem(Long id);

    /**
     * 修改指定订单设置
     */
    int update(Long id, OmsOrderSetting orderSetting);
}
