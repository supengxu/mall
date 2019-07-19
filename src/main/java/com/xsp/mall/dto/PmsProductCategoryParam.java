package com.xsp.mall.dto;

import com.xsp.mall.validator.FlagValidator;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Min;
import java.util.List;

/**
 * 添加更新产品分类的参数
 * Created by xsp on 2018/4/26.
 */
public class PmsProductCategoryParam {
    // "父分类的编号")
    private Long parentId;
    // value = "商品分类名称",required = true)
    @NotEmpty(message = "商品分类名称不能为空")
    private String name;
    // "分类单位")
    private String productUnit;
    // "是否在导航栏显示")
    @FlagValidator(value = {"0", "1"}, message = "状态只能为0或1")
    private Integer navStatus;
    // "是否进行显示")
    @FlagValidator(value = {"0", "1"}, message = "状态只能为0或1")
    private Integer showStatus;
    // "排序")
    @Min(value = 0, message = "排序最小为0")
    private Integer sort;
    // "图标")
    private String icon;
    // "关键字")
    private String keywords;
    // "描述")
    private String description;
    // "产品相关筛选属性集合")
    private List<Long> productAttributeIdList;

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit;
    }

    public Integer getNavStatus() {
        return navStatus;
    }

    public void setNavStatus(Integer navStatus) {
        this.navStatus = navStatus;
    }

    public Integer getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Long> getProductAttributeIdList() {
        return productAttributeIdList;
    }

    public void setProductAttributeIdList(List<Long> productAttributeIdList) {
        this.productAttributeIdList = productAttributeIdList;
    }
}
