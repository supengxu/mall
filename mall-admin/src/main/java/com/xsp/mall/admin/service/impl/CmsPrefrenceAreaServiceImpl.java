package com.xsp.mall.admin.service.impl;

import com.xsp.mall.admin.mapper.CmsPrefrenceAreaMapper;
import com.xsp.mall.admin.pojo.CmsPrefrenceArea;
import com.xsp.mall.admin.pojo.CmsPrefrenceAreaExample;
import com.xsp.mall.admin.service.CmsPrefrenceAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品优选Service实现类
 * Created by xsp on 2018/6/1.
 */
@Service
public class CmsPrefrenceAreaServiceImpl implements CmsPrefrenceAreaService {
    @Autowired
    private CmsPrefrenceAreaMapper prefrenceAreaMapper;

    @Override
    public List<CmsPrefrenceArea> listAll() {
        return prefrenceAreaMapper.selectByExample(new CmsPrefrenceAreaExample());
    }
}
