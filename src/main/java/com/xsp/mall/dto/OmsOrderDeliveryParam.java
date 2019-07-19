package com.xsp.mall.dto;


import lombok.Getter;
import lombok.Setter;

/**
 * 订单发货参数
 * Created by xsp on 2018/10/12.
 */
@Getter
@Setter
public class OmsOrderDeliveryParam {
    // "订单id")
    private Long orderId;
    // "物流公司")
    private String deliveryCompany;
    // "物流单号")
    private String deliverySn;
}
