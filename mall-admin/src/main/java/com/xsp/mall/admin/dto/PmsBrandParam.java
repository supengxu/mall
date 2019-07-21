package com.xsp.mall.admin.dto;


import com.xsp.mall.admin.validator.FlagValidator;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

/**
 * 品牌传递参数
 * Created by xsp on 2018/4/26.
 */
@Setter
@Getter
public class PmsBrandParam {
    @NotBlank(message = "名称不能为空")
    private String name;
    // "品牌首字母"
    private String firstLetter;
    // "排序字段"
    @Min(value = 0, message = "排序最小为0")
    private Integer sort;
    //ty(value = "是否为厂家制造商")
    @FlagValidator(value = {"0","1"}, message = "厂家状态不正确")
    private Integer factoryStatus;
    //ty(value = "是否进行显示")
    @FlagValidator(value = {"0","1"}, message = "显示状态不正确")
    private Integer showStatus;
    //ty(value = "品牌logo",required = true)
    @NotBlank(message = "品牌logo不能为空")
    private String logo;
    //ty(value = "品牌大图")
    private String bigPic;
    //ty(value = "品牌故事")
    private String brandStory;
}
