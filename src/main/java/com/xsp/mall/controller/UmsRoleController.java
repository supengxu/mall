package com.xsp.mall.controller;

import com.xsp.mall.pojo.UmsPermission;
import com.xsp.mall.pojo.UmsRole;
import com.xsp.mall.result.CommonResult;
import com.xsp.mall.service.UmsRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 后台用户角色管理
 * Created by xsp on 2018/9/30.
 */
@CrossOrigin
@RestController
@RequestMapping("/role")
public class UmsRoleController {
    @Autowired
    private UmsRoleService roleService;

    // 添加角色"
    @PostMapping( "/create")
    public CommonResult create(@RequestBody UmsRole role) {
        int count = roleService.create(role);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    // 修改角色")
    @PostMapping("/update/{id}")
    public CommonResult update(@PathVariable Long id, @RequestBody UmsRole role) {
        int count = roleService.update(id, role);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    // 批量删除角色")
    @PostMapping("/delete")
    public CommonResult delete(@RequestParam("ids") List<Long> ids) {
        int count = roleService.delete(ids);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    // 获取相应角色权限")
    @GetMapping("/permission/{roleId}")
    public CommonResult<List<UmsPermission>> getPermissionList(@PathVariable Long roleId) {
        List<UmsPermission> permissionList = roleService.getPermissionList(roleId);
        return CommonResult.success(permissionList);
    }

    // 修改角色权限")
    @PostMapping( "/permission/update")
    public CommonResult updatePermission(@RequestParam Long roleId,
                                         @RequestParam("permissionIds") List<Long> permissionIds) {
        int count = roleService.updatePermission(roleId, permissionIds);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    // 获取所有角色")
    @GetMapping("/list")
    public Object list() {
        List<UmsRole> roleList = roleService.list();
        return CommonResult.success(roleList);
    }

}
