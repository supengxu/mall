package com.xsp.mall.admin.dto;

import com.xsp.mall.admin.pojo.OmsCompanyAddress;
import com.xsp.mall.admin.pojo.OmsOrderReturnApply;
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
