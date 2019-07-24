package com.xsp.mall.frontend.controller;

import com.xsp.mall.frontend.dto.ConfirmOrderResult;
import com.xsp.mall.frontend.dto.OrderParam;
import com.xsp.mall.frontend.service.OmsPortalOrderService;
import com.xsp.mall.result.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 订单管理Controller
 * Created by xsp on 2018/8/30.
 */
@RestController
@RequestMapping("/order")
public class OmsPortalOrderController {
    @Autowired
    private OmsPortalOrderService portalOrderService;

    // 根据购物车信息生成确认单信息")
    @PostMapping("/generateConfirmOrder")

    public CommonResult<ConfirmOrderResult> generateConfirmOrder() {
        ConfirmOrderResult confirmOrderResult = portalOrderService.generateConfirmOrder();
        return CommonResult.success(confirmOrderResult);
    }

    // 根据购物车信息生成订单")
    @PostMapping("/generateOrder")
    public Object generateOrder(@RequestBody OrderParam orderParam) {
        return portalOrderService.generateOrder(orderParam);
    }

    // 支付成功的回调")
    @PostMapping("/paySuccess")
    public Object paySuccess(@RequestParam Long orderId) {
        return portalOrderService.paySuccess(orderId);
    }

    // 自动取消超时订单")
    @PostMapping("/cancelTimeOutOrder")
    public Object cancelTimeOutOrder() {
        return portalOrderService.cancelTimeOutOrder();
    }

    // 取消单个超时订单")
    @PostMapping("/cancelOrder")
    public CommonResult cancelOrder(Long orderId) {
        portalOrderService.sendDelayMessageCancelOrder(orderId);
        return CommonResult.success(null);
    }
}
