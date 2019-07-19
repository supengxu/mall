package com.xsp.mall.controller;

import com.xsp.mall.dto.PmsProductCategoryWithChildrenItem;
import com.xsp.mall.result.CommonResult;
import com.xsp.mall.service.PmsProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/productCategory")
public class PmsProductCategoryController  {

    @Autowired
    PmsProductCategoryService productCategoryService;

    @GetMapping("/list/withChildren")
    public CommonResult<List<PmsProductCategoryWithChildrenItem>> listWithChildren() {
        List<PmsProductCategoryWithChildrenItem> list = productCategoryService.listWithChildren();
        return CommonResult.success(list);
    }

}
