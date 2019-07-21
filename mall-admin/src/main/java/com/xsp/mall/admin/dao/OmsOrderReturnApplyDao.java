package com.xsp.mall.admin.dao;

import com.xsp.mall.admin.dto.OmsOrderReturnApplyResult;
import com.xsp.mall.model.OmsOrderReturnApply;
import com.xsp.mall.admin.dto.OmsReturnApplyQueryParam;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 订单退货申请自定义Dao
 * Created by xsp on 2018/10/18.
 */
public interface OmsOrderReturnApplyDao {
    /**
     * 查询申请列表
     */
    List<OmsOrderReturnApply> getList(@Param("queryParam") OmsReturnApplyQueryParam queryParam);

    /**
     * 获取申请详情
     */
    OmsOrderReturnApplyResult getDetail(@Param("id") Long id);
}
