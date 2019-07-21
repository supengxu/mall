package com.xsp.mall.admin.dto;


import lombok.Getter;
import lombok.Setter;

/**
 * oss上传成功后的回调参数
 * Created by xsp on 2018/5/17.
 */
@Getter
@Setter
public class OssCallbackParam {
    // "请求的回调地址")
    private String callbackUrl;
    // "回调是传入request中的参数")
    private String callbackBody;
    // "回调时传入参数的格式，比如表单提交形式")
    private String callbackBodyType;
}
