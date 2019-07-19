package com.xsp.mall.admin.dto;

import com.xsp.mall.admin.pojo.OmsOrder;
import com.xsp.mall.admin.pojo.OmsOrderItem;
import com.xsp.mall.admin.pojo.OmsOrderOperateHistory;
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
