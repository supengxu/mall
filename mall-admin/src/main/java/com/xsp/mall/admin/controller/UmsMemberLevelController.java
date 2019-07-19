package com.xsp.mall.admin.controller;

import com.xsp.mall.admin.pojo.UmsMemberLevel;
import com.xsp.mall.admin.result.CommonResult;
import com.xsp.mall.admin.service.UmsMemberLevelService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 会员等级管理Controller
 * Created by xsp on 2018/4/26.
 */
@CrossOrigin
@RestController
@RequestMapping("/memberLevel")
public class UmsMemberLevelController {
    @Autowired
    private UmsMemberLevelService memberLevelService;


    // 查询所有会员等级")
    @GetMapping(value = "/list")
    public CommonResult<List<UmsMemberLevel>> list(@RequestParam("defaultStatus") Integer defaultStatus) {
        List<UmsMemberLevel> memberLevelList = memberLevelService.list(defaultStatus);
        return CommonResult.success(memberLevelList);
    }
}
