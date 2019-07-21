package com.xsp.mall.mapper;

import com.xsp.mall.model.pojo.Permission;

import java.util.List;


public interface PermissionMapper {
    /**
     *  获取该用户的所有权限
     */
    List<Permission> getPermissionList(Long adminId);
}