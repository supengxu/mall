package com.xsp.mall.frontend.controller;

import com.xsp.mall.frontend.pojo.MemberBrandAttention;
import com.xsp.mall.frontend.service.MemberAttentionService;
import com.xsp.mall.result.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 会员关注品牌管理Controller
 * Created by xsp on 2018/8/2.
 */
@RestController
@RequestMapping("/member/attention")
public class MemberAttentionController {
    @Autowired
    private MemberAttentionService memberAttentionService;

    // 添加品牌关注")
    @PostMapping("/add")
    public CommonResult add(@RequestBody MemberBrandAttention memberBrandAttention) {
        int count = memberAttentionService.add(memberBrandAttention);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    // 取消关注")
    @PostMapping("/delete")
    public CommonResult delete(Long memberId, Long brandId) {
        int count = memberAttentionService.delete(memberId, brandId);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    // 显示关注列表")
    @GetMapping("/list/{memberId}")
    public CommonResult<List<MemberBrandAttention>> list(@PathVariable Long memberId) {
        List<MemberBrandAttention> memberBrandAttentionList = memberAttentionService.list(memberId);
        return CommonResult.success(memberBrandAttentionList);
    }
}
