package com.xsp.mall.admin.controller;

import com.xsp.mall.admin.dto.OmsOrderReturnApplyResult;
import com.xsp.mall.admin.dto.OmsUpdateStatusParam;
import com.xsp.mall.admin.result.CommonPage;
import com.xsp.mall.admin.result.CommonResult;
import com.xsp.mall.admin.dto.OmsReturnApplyQueryParam;
import com.xsp.mall.admin.pojo.OmsOrderReturnApply;
import com.xsp.mall.admin.service.OmsOrderReturnApplyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 订单退货申请管理
 * Created by xsp on 2018/10/18.
 */
@RestController
@CrossOrigin
@RequestMapping("/returnApply")
public class OmsOrderReturnApplyController {
    @Autowired
    private OmsOrderReturnApplyService returnApplyService;

    // 分页查询退货申请")
    @GetMapping("/list")
    public CommonResult<CommonPage<OmsOrderReturnApply>> list(OmsReturnApplyQueryParam queryParam,
                                                              @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                              @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<OmsOrderReturnApply> returnApplyList = returnApplyService.list(queryParam, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(returnApplyList));
    }

    // 批量删除申请
    @PostMapping( "/delete")
    public CommonResult delete(@RequestParam("ids") List<Long> ids) {
        int count = returnApplyService.delete(ids);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    // 获取退货申请详情")
    @GetMapping("/{id}")
    public CommonResult getItem(@PathVariable Long id) {
        OmsOrderReturnApplyResult result = returnApplyService.getItem(id);
        return CommonResult.success(result);
    }

    // 修改申请状态")
    @PostMapping("/update/status/{id}")
    public CommonResult updateStatus(@PathVariable Long id, @RequestBody OmsUpdateStatusParam statusParam) {
        int count = returnApplyService.updateStatus(id, statusParam);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

}
