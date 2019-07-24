package com.xsp.mall.frontend.service.Impl;

import com.xsp.mall.frontend.dto.MemberProductCollection;
import com.xsp.mall.frontend.service.MemberCollectionService;

import java.util.List;

/**
 * 会员收藏Service 实现类
 */
public class MemberCollectionServiceImpl implements MemberCollectionService {
    @Override
    public int addProduct(MemberProductCollection productCollection) {
        return 0;
    }

    @Override
    public int deleteProduct(Long memberId, Long productId) {
        return 0;
    }

    @Override
    public List<MemberProductCollection> listProduct(Long memberId) {
        return null;
    }
}
