package com.xsp.mall.controller;

import com.xsp.mall.dto.PmsBrandParam;
import com.xsp.mall.pojo.PmsBrand;
import com.xsp.mall.result.CommonPage;
import com.xsp.mall.result.CommonResult;
import com.xsp.mall.service.PmsBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/brand")
@CrossOrigin
public class PmsBrandController  {
    @Autowired
    private PmsBrandService pmsBrandService;

    /**
     * 获取全部品牌列表
     * @return
     */
    @GetMapping("/listAll")
    public CommonResult<List<PmsBrand>> getList(){
        return CommonResult.success(pmsBrandService.listAllBrand());
    }

    /**
     * 添加品牌
     * @param pmsBrand 前端传输的 pmsBrand 的参数
     * @param result 参数验证的 结果集
     * @return
     */
    @PostMapping("/create")
    public CommonResult create(@Valid @RequestBody PmsBrandParam pmsBrand, BindingResult result){
        CommonResult  commonResult;
        if (result.hasErrors()) {
            return CommonResult.failed("缺少参数或者参数格式不对");
        }
        int count = pmsBrandService.createBrand(pmsBrand);
        if (count == 1){
           commonResult = CommonResult.success(count);
        }else {
            commonResult = CommonResult.failed();
        }
        return  commonResult;
    }

    /**
     * 更新品牌
     * @param id
     * @param pmsBrandParam
     * @param result
     * @return
     */
    @PostMapping("/update/{id}")
    public CommonResult update(@PathVariable("id") Long id,
                               @Validated @RequestBody PmsBrandParam pmsBrandParam,
                               BindingResult result) {
        CommonResult commonResult;
        int count = pmsBrandService.updateBrand(id, pmsBrandParam);
        if (count == 1) {
            commonResult = CommonResult.success(count);
        } else {
            commonResult = CommonResult.failed();
        }
        return commonResult;
    }

    /**
     * TODO 修改动词为 Delete
     * 删除品牌
     * @param id
     * @return
     */
    @GetMapping("/delete/{id}")
    public CommonResult delete(@PathVariable("id") Long id) {
        int count = pmsBrandService.deleteBrand(id);
        if (count == 1) {
            return CommonResult.success(null);
        } else {
            return CommonResult.failed();
        }
    }

    /**
     *  根据编号查询品牌信息
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public CommonResult<PmsBrand> getItem(@PathVariable("id") Long id) {
        return CommonResult.success(pmsBrandService.getBrand(id));
    }

    /**
     * TODO 动词应该修改为DELETE
     * 批量删除品牌
     * @param ids
     * @return
     */
    @PostMapping("/delete/batch")
    public CommonResult deleteBatch(@RequestParam("ids") List<Long> ids) {
        int count = pmsBrandService.deleteBrand(ids);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    /**
     * 批量更新显示状态
     * @param ids
     * @param showStatus
     * @return
     */
    @PostMapping("/update/showStatus")
    public CommonResult updateShowStatus(@RequestParam("ids") List<Long> ids,
                                         @RequestParam("showStatus") Integer showStatus) {
        int count = pmsBrandService.updateShowStatus(ids, showStatus);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    /**
     * 批量更新厂家制造商状态
     * @param ids
     * @param factoryStatus
     * @return
     */
    @PostMapping("/update/factoryStatus")
    public CommonResult updateFactoryStatus(@RequestParam("ids") List<Long> ids,
                                            @RequestParam("factoryStatus") Integer factoryStatus) {
        int count = pmsBrandService.updateFactoryStatus(ids, factoryStatus);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }
    @GetMapping("/list")
    public CommonResult<CommonPage<PmsBrand>> getList(@RequestParam(value = "keyword", required = false) String keyword,
                                                      @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                      @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize) {
        List<PmsBrand> brandList = pmsBrandService.listBrand(keyword, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(brandList));
    }


}
