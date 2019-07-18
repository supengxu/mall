package com.xsp.mall.mapper;

import com.xsp.mall.pojo.Admin;
import com.xsp.mall.pojo.Permission;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface AdminMapper {
    Admin findAdminByName(String userName);


}
