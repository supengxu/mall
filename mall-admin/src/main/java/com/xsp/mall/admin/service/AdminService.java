package com.xsp.mall.admin.service;

import com.xsp.mall.model.Admin;

public interface AdminService {

    Admin getAdminByUserName(String username);

    String Login(String username,String password);
}
