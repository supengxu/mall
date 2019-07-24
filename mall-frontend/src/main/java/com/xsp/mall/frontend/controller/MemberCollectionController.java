package com.xsp.mall.frontend.controller;

import com.xsp.mall.frontend.dto.MemberProductCollection;
import com.xsp.mall.frontend.service.MemberCollectionService;
import com.xsp.mall.result.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 会员收藏管理Controller
 * Created by xsp on 2018/8/2.
 */
@RestController
@RequestMapping("/member/collection")
public class MemberCollectionController {
    @Autowired
    private MemberCollectionService memberCollectionService;

    // 添加商品收藏")
    @PostMapping("/addProduct")
    public CommonResult addProduct(@RequestBody MemberProductCollection productCollection) {
        int count = memberCollectionService.addProduct(productCollection);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    // 删除收藏商品")
    @PostMapping(value = "/deleteProduct")
    public CommonResult deleteProduct(Long memberId, Long productId) {
        int count = memberCollectionService.deleteProduct(memberId, productId);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    // 显示关注列表")
    @GetMapping(value = "/listProduct/{memberId}")
    public CommonResult<List<MemberProductCollection>> listProduct(@PathVariable Long memberId) {
        List<MemberProductCollection> memberProductCollectionList = memberCollectionService.listProduct(memberId);
        return CommonResult.success(memberProductCollectionList);
    }
}
