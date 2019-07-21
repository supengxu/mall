package com.xsp.mall.admin.controller;

import com.xsp.mall.model.OmsOrderSetting;
import com.xsp.mall.result.CommonResult;
import com.xsp.mall.admin.service.OmsOrderSettingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 订单设置Controller
 * Created by xsp on 2018/10/16.
 */
@RestController
@CrossOrigin
@RequestMapping("/orderSetting")
public class OmsOrderSettingController {
    @Autowired
    private OmsOrderSettingService orderSettingService;

    // 获取指定订单设置")
    @GetMapping("/{id}")
    public CommonResult<OmsOrderSetting> getItem(@PathVariable Long id) {
        OmsOrderSetting orderSetting = orderSettingService.getItem(id);
        return CommonResult.success(orderSetting);
    }

    // 修改指定订单设置")
    @PostMapping(value = "/update/{id}")
    public CommonResult update(@PathVariable Long id, @RequestBody OmsOrderSetting orderSetting) {
        int count = orderSettingService.update(id,orderSetting);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }
}
