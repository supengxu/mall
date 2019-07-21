package com.xsp.mall.admin.service.impl;

import com.xsp.mall.admin.bo.AdminUserDetails;
import com.xsp.mall.mapper.PermissionMapper;
import com.xsp.mall.model.Permission;
import com.xsp.mall.mapper.AdminMapper;
import com.xsp.mall.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UmsAdminDetailServiceImpl implements  UserDetailsService {
    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Admin admin = adminMapper.findAdminByName(userName);

        if (admin == null) {
            throw new UsernameNotFoundException(String.format("No user found with username '%s'.", userName));
        } else {
            List<Permission> permissionList = permissionMapper.getPermissionList(admin.getId());
            return new AdminUserDetails(admin,permissionList);
        }
    }
}
