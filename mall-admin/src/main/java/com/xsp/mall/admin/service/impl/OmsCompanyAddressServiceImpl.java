package com.xsp.mall.admin.service.impl;

import com.xsp.mall.mapper.OmsCompanyAddressMapper;
import com.xsp.mall.model.OmsCompanyAddress;
import com.xsp.mall.model.OmsCompanyAddressExample;
import com.xsp.mall.admin.service.OmsCompanyAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 收货地址管理Service实现类
 * Created by xsp on 2018/10/18.
 */
@Service
public class OmsCompanyAddressServiceImpl implements OmsCompanyAddressService {
    @Autowired
    private OmsCompanyAddressMapper companyAddressMapper;
    @Override
    public List<OmsCompanyAddress> list() {
        return companyAddressMapper.selectByExample(new OmsCompanyAddressExample());
    }
}
