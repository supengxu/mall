package com.xsp.mall.admin.controller;

import com.xsp.mall.model.CmsPrefrenceArea;
import com.xsp.mall.result.CommonResult;
import com.xsp.mall.admin.service.CmsPrefrenceAreaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 商品优选管理Controller
 * Created by xsp on 2018/6/1.
 */
@RestController
@CrossOrigin
@RequestMapping("/prefrenceArea")
public class CmsPrefrenceAreaController {
    @Autowired
    private CmsPrefrenceAreaService prefrenceAreaService;

    // 获取所有商品优选")
    @GetMapping(value = "/listAll")
    public CommonResult<List<CmsPrefrenceArea>> listAll() {
        List<CmsPrefrenceArea> prefrenceAreaList = prefrenceAreaService.listAll();
        return CommonResult.success(prefrenceAreaList);
    }
}
