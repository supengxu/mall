package com.xsp.mall.admin.service;

import com.xsp.mall.admin.dto.OmsOrderReturnApplyResult;
import com.xsp.mall.admin.dto.OmsUpdateStatusParam;
import com.xsp.mall.model.OmsOrderReturnApply;
import com.xsp.mall.admin.dto.OmsReturnApplyQueryParam;

import java.util.List;

/**
 * 退货申请管理Service
 * Created by xsp on 2018/10/18.
 */
public interface OmsOrderReturnApplyService {
    /**
     * 分页查询申请
     */
    List<OmsOrderReturnApply> list(OmsReturnApplyQueryParam queryParam, Integer pageSize, Integer pageNum);

    /**
     * 批量删除申请
     */
    int delete(List<Long> ids);

    /**
     * 修改申请状态
     */
    int updateStatus(Long id, OmsUpdateStatusParam statusParam);

    /**
     * 获取指定申请详情
     */
    OmsOrderReturnApplyResult getItem(Long id);
}
