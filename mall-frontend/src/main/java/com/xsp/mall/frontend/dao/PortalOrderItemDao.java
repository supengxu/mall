package com.xsp.mall.frontend.dao;

import com.xsp.mall.model.OmsOrderItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 订单商品信息自定义Dao
 * Created by xsp on 2018/9/3.
 */
public interface PortalOrderItemDao {
    int insertList(@Param("list") List<OmsOrderItem> list);
}
