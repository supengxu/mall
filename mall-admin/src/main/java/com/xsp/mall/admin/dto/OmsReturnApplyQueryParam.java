package com.xsp.mall.admin.dto;


import lombok.Getter;
import lombok.Setter;

/**
 * 订单退货申请查询参数
 * Created by xsp on 2018/10/18.
 */
@Getter
@Setter
public class OmsReturnApplyQueryParam {
    // "服务单号")
    private Long id;
    // value = "收货人姓名/号码")
    private String receiverKeyword;
    // value = "申请状态：0->待处理；1->退货中；2->已完成；3->已拒绝")
    private Integer status;
    // value = "申请时间")
    private String createTime;
    // value = "处理人员")
    private String handleMan;
    // value = "处理时间")
    private String handleTime;
}
