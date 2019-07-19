package com.xsp.mall.dto;

import com.xsp.mall.pojo.OmsCompanyAddress;
import com.xsp.mall.pojo.OmsOrderReturnApply;
import lombok.Getter;
import lombok.Setter;

/**
 * 申请信息封装
 * Created by xsp on 2018/10/18.
 */
public class OmsOrderReturnApplyResult extends OmsOrderReturnApply {
    @Getter
    @Setter
    private OmsCompanyAddress companyAddress;
}
