package com.xsp.mall.admin.service;

import com.xsp.mall.admin.pojo.OmsCompanyAddress;

import java.util.List;

/**
 * 收货地址管Service
 * Created by xsp on 2018/10/18.
 */
public interface OmsCompanyAddressService {
    /**
     * 获取全部收货地址
     */
    List<OmsCompanyAddress> list();
}
