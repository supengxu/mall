package com.xsp.mall.dto;

import com.xsp.mall.validator.FlagValidator;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * 商品属性参数
 * Created by xsp on 2018/4/26.
 */
public class PmsProductAttributeParam {
    // "属性分类ID")
    @NotEmpty(message = "属性分类不能为空")
    private Long productAttributeCategoryId;
    // "属性名称")
    @NotEmpty(message = "属性名称不能为空")
    private String name;
    // "属性选择类型：0->唯一；1->单选；2->多选")
    @FlagValidator({"0", "1", "2"})
    private Integer selectType;
    // "属性录入方式：0->手工录入；1->从列表中选取")
    @FlagValidator({"0", "1"})
    private Integer inputType;
    // "可选值列表，以逗号隔开")
    private String inputList;

    private Integer sort;
    // "分类筛选样式：0->普通；1->颜色")
    @FlagValidator({"0", "1"})
    private Integer filterType;
    // "检索类型；0->不需要进行检索；1->关键字检索；2->范围检索")
    @FlagValidator({"0", "1", "2"})
    private Integer searchType;
    // "相同属性产品是否关联；0->不关联；1->关联")
    @FlagValidator({"0", "1"})
    private Integer relatedStatus;
    // "是否支持手动新增；0->不支持；1->支持")
    @FlagValidator({"0", "1"})
    private Integer handAddStatus;
    // "属性的类型；0->规格；1->参数")
    @FlagValidator({"0", "1"})
    private Integer type;

    public Long getProductAttributeCategoryId() {
        return productAttributeCategoryId;
    }

    public void setProductAttributeCategoryId(Long productAttributeCategoryId) {
        this.productAttributeCategoryId = productAttributeCategoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSelectType() {
        return selectType;
    }

    public void setSelectType(Integer selectType) {
        this.selectType = selectType;
    }

    public Integer getInputType() {
        return inputType;
    }

    public void setInputType(Integer inputType) {
        this.inputType = inputType;
    }

    public String getInputList() {
        return inputList;
    }

    public void setInputList(String inputList) {
        this.inputList = inputList;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getFilterType() {
        return filterType;
    }

    public void setFilterType(Integer filterType) {
        this.filterType = filterType;
    }

    public Integer getSearchType() {
        return searchType;
    }

    public void setSearchType(Integer searchType) {
        this.searchType = searchType;
    }

    public Integer getRelatedStatus() {
        return relatedStatus;
    }

    public void setRelatedStatus(Integer relatedStatus) {
        this.relatedStatus = relatedStatus;
    }

    public Integer getHandAddStatus() {
        return handAddStatus;
    }

    public void setHandAddStatus(Integer handAddStatus) {
        this.handAddStatus = handAddStatus;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
