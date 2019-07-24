package com.xsp.mall.frontend.service.Impl;

import com.xsp.mall.frontend.pojo.MemberBrandAttention;
import com.xsp.mall.frontend.service.MemberAttentionService;

import java.util.List;

/**
 * 会员关注实现类
 */
public class MemberAttentionServiceImpl implements MemberAttentionService {
    // TODO 构建一个用户关注品牌表，使用 JPA 进行写入
    @Override
    public int add(MemberBrandAttention memberBrandAttention) {
        return 0;
    }

    @Override
    public int delete(Long memberId, Long brandId) {
        return 0;
    }

    @Override
    public List<MemberBrandAttention> list(Long memberId) {
        return null;
    }
}
