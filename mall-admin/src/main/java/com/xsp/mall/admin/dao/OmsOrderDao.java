package com.xsp.mall.admin.dao;

import com.xsp.mall.admin.dto.OmsOrderDeliveryParam;
import com.xsp.mall.admin.dto.OmsOrderQueryParam;
import com.xsp.mall.model.OmsOrder;
import com.xsp.mall.admin.dto.OmsOrderDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 订单自定义查询Dao
 * Created by xsp on 2018/10/12.
 */
public interface OmsOrderDao {
    /**
     * 条件查询订单
     */
    List<OmsOrder> getList(@Param("queryParam") OmsOrderQueryParam queryParam);

    /**
     * 批量发货
     */
    int delivery(@Param("list") List<OmsOrderDeliveryParam> deliveryParamList);

    /**
     * 获取订单详情
     */
    OmsOrderDetail getDetail(@Param("id") Long id);
}
