package com.xsp.mall.admin.mapper;

import com.xsp.mall.admin.pojo.Permission;

import java.util.List;


public interface PermissionMapper {
    /**
     *  获取该用户的所有权限
     */
    List<Permission> getPermissionList(Long adminId);
}