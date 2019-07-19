package com.xsp.mall.dto;

import com.xsp.mall.pojo.OmsOrder;
import com.xsp.mall.pojo.OmsOrderItem;
import com.xsp.mall.pojo.OmsOrderOperateHistory;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 订单详情信息
 * Created by xsp on 2018/10/11.
 */
public class OmsOrderDetail extends OmsOrder {
    @Getter
    @Setter
    private List<OmsOrderItem> orderItemList;
    @Getter
    @Setter
    private List<OmsOrderOperateHistory> historyList;
}
