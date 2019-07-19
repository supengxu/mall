package com.xsp.mall.admin.controller;

import com.xsp.mall.admin.pojo.OmsCompanyAddress;
import com.xsp.mall.admin.result.CommonResult;
import com.xsp.mall.admin.service.OmsCompanyAddressService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 收货地址管理Controller
 * Created by xsp on 2018/10/18.
 */
@RestController
@CrossOrigin
@RequestMapping("/companyAddress")
public class OmsCompanyAddressController {
    @Autowired
    private OmsCompanyAddressService companyAddressService;

    // 获取所有收货地址
    @GetMapping("/list")
    public CommonResult<List<OmsCompanyAddress>> list() {
        List<OmsCompanyAddress> companyAddressList = companyAddressService.list();
        return CommonResult.success(companyAddressList);
    }
}
