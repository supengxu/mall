package com.xsp.mall.frontend.dto;

import com.xsp.mall.model.OmsOrder;
import com.xsp.mall.model.OmsOrderItem;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 包含订单商品信息的订单详情
 * Created by xsp on 2018/9/4.
 */
public class OmsOrderDetail extends OmsOrder {
    @Getter
    @Setter
    private List<OmsOrderItem> orderItemList;
}
