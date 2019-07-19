package com.xsp.mall.admin.controller;

import com.xsp.mall.admin.pojo.CmsSubject;
import com.xsp.mall.admin.result.CommonPage;
import com.xsp.mall.admin.result.CommonResult;
import com.xsp.mall.admin.service.CmsSubjectService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 商品专题Controller
 * Created by xsp on 2018/6/1.
 */
@CrossOrigin
@RestController
@RequestMapping("/subject")
public class CmsSubjectController {
    @Autowired
    private CmsSubjectService subjectService;

    // 获取全部商品专题
    @GetMapping(value = "/listAll")
    public CommonResult<List<CmsSubject>> listAll() {
        List<CmsSubject> subjectList = subjectService.listAll();
        return CommonResult.success(subjectList);
    }

    //  "根据专题名称分页获取专题
    @GetMapping(value = "/list")
    public CommonResult<CommonPage<CmsSubject>> getList(@RequestParam(value = "keyword", required = false) String keyword,
                                                        @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                        @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize) {
        List<CmsSubject> subjectList = subjectService.list(keyword, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(subjectList));
    }
}
