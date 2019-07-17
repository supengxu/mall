package com.xsp.mall.service;

import com.xsp.mall.pojo.Admin;

public interface AdminService {

    Admin getAdminByUserName(String username);

    String Login(String username,String password);
}
