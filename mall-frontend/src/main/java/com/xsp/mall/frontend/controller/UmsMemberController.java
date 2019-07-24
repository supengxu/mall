package com.xsp.mall.frontend.controller;

import com.xsp.mall.frontend.service.UmsMemberService;
import com.xsp.mall.result.CommonResult;
import com.xsp.mall.portal.service.UmsMemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 会员登录注册管理Controller
 * Created by xsp on 2018/8/3.
 */
@RestController
@RequestMapping("/sso")
public class UmsMemberController {
    @Autowired
    private UmsMemberService memberService;

   // 注册")
    @PostMapping(value = "/register")
    public CommonResult register(@RequestParam String username,
                                 @RequestParam String password,
                                 @RequestParam String telephone,
                                 @RequestParam String authCode) {
        return memberService.register(username, password, telephone, authCode);
    }

   // 获取验证码")
    @RequestMapping(value = "/getAuthCode", method = RequestMethod.GET)

    public CommonResult getAuthCode(@RequestParam String telephone) {
        return memberService.generateAuthCode(telephone);
    }

   // 修改密码")
    @RequestMapping(value = "/updatePassword")

    public CommonResult updatePassword(@RequestParam String telephone,
                                 @RequestParam String password,
                                 @RequestParam String authCode) {
        return memberService.updatePassword(telephone,password,authCode);
    }
}
