package com.xsp.mall.admin.dto;


import lombok.Getter;
import lombok.Setter;

/**
 * oss上传文件的回调结果
 * Created by xsp on 2018/5/17.
 */
@Getter
@Setter
public class OssCallbackResult {
    // "文件名称")
    private String filename;
    // "文件大小")
    private String size;
    // "文件的mimeType")
    private String mimeType;
    // "图片文件的宽")
    private String width;
    // "图片文件的高")
    private String height;
}
