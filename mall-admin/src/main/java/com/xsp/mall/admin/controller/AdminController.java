package com.xsp.mall.admin.controller;

import com.xsp.mall.admin.dto.AdminLoginParam;
import com.xsp.mall.admin.pojo.Admin;
import com.xsp.mall.admin.result.CommonResult;
import com.xsp.mall.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.security.Principal;
import java.util.HashMap;
import java.util.Map;


// TODO 修改返回值方式
@RestController
@RequestMapping("/admin")
@CrossOrigin
public class AdminController {
    @Autowired
    AdminService adminService;

    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @GetMapping("/test")
    private Admin getAdmin() {
        return adminService.getAdminByUserName("admin");
    }

    @PostMapping("/login")
    private CommonResult login(@RequestBody @Valid AdminLoginParam adminLoginParam, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return CommonResult.failed("缺少参数或者参数格式不对");
        }
        String token = adminService.Login(adminLoginParam.getUsername(), adminLoginParam.getPassword());
        if (token == null) {
            return CommonResult.validateFailed("用户名或密码错误");
        }

        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", token);
        tokenMap.put("tokenHead", tokenHead);
        return CommonResult.success(tokenMap);
    }

    @GetMapping("/info")
    public CommonResult getAdminInfo(Principal principal) {
        String username = principal.getName();
        Admin admin = adminService.getAdminByUserName(username);
        Map<String, Object> data = new HashMap<>();
        data.put("username", admin.getUsername());
        data.put("roles", new String[]{"TEST"});
        data.put("icon", admin.getIcon());
        return CommonResult.success(data);
    }

    /**
     *  登出{由前端把 Token 的值给 扔掉}
     * @return CommonResult
     */
    @PostMapping("logout")
    public CommonResult logout() {
        return CommonResult.success(null);
    }

}
