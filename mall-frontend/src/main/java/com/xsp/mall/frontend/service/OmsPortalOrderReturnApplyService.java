package com.xsp.mall.frontend.service;

import com.xsp.mall.portal.domain.OmsOrderReturnApplyParam;

/**
 * 订单退货管理Service
 * Created by xsp on 2018/10/17.
 */
public interface OmsPortalOrderReturnApplyService {
    /**
     * 提交申请
     */
    int create(OmsOrderReturnApplyParam returnApply);
}
