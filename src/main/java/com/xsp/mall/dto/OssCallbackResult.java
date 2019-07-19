package com.xsp.mall.dto;



/**
 * oss上传文件的回调结果
 * Created by xsp on 2018/5/17.
 */
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

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }
}
