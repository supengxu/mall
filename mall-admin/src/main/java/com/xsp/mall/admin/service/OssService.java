package com.xsp.mall.admin.service;

import com.xsp.mall.admin.dto.OssPolicyResult;
import com.xsp.mall.admin.dto.OssCallbackResult;

import javax.servlet.http.HttpServletRequest;

/**
 * oss上传管理Service
 * Created by xsp on 2018/5/17.
 */
public interface OssService {
    /**
     * oss上传策略生成
     */
    OssPolicyResult policy();
    /**
     * oss上传成功回调
     */
    OssCallbackResult callback(HttpServletRequest request);
}
