package com.xsp.mall.admin.dto;


import lombok.Getter;
import lombok.Setter;

/**
 * 订单查询参数
 * Created by xsp on 2018/10/11.
 */
@Getter
@Setter
public class OmsOrderQueryParam {
    // value = "订单编号")
    private String orderSn;
    // value = "收货人姓名/号码")
    private String receiverKeyword;
    // value = "订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单")
    private Integer status;
    // value = "订单类型：0->正常订单；1->秒杀订单")
    private Integer orderType;
    // value = "订单来源：0->PC订单；1->app订单")
    private Integer sourceType;
    // value = "订单提交时间")
    private String createTime;
}
