package com.xsp.mall.frontend.controller;

import com.xsp.mall.frontend.dto.OmsOrderReturnApplyParam;
import com.xsp.mall.frontend.service.OmsPortalOrderReturnApplyService;
import com.xsp.mall.result.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 申请退货管理Controller
 * Created by xsp on 2018/10/17.
 */
@RestController
@RequestMapping("/returnApply")
public class OmsPortalOrderReturnApplyController {
    @Autowired
    private OmsPortalOrderReturnApplyService returnApplyService;

    // 申请退货")
    @PostMapping(value = "/create")
    public CommonResult create(@RequestBody OmsOrderReturnApplyParam returnApply) {
        int count = returnApplyService.create(returnApply);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }
}
