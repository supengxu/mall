package com.xsp.mall.frontend.controller;

import com.xsp.mall.frontend.dto.CartProduct;
import com.xsp.mall.frontend.dto.CartPromotionItem;
import com.xsp.mall.frontend.service.OmsCartItemService;
import com.xsp.mall.frontend.service.UmsMemberService;
import com.xsp.mall.model.OmsCartItem;
import com.xsp.mall.result.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 购物车管理Controller
 * Created by xsp on 2018/8/2.
 */
@RestController
@RequestMapping("/cart")
public class OmsCartItemController {
    @Autowired
    private OmsCartItemService cartItemService;
    @Autowired
    private UmsMemberService memberService;

    // 添加商品到购物车")
    @PostMapping(value = "/add")
    public CommonResult add(@RequestBody OmsCartItem cartItem) {
        int count = cartItemService.add(cartItem);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    // 获取某个会员的购物车列表")
    @GetMapping("/list")
    public CommonResult<List<OmsCartItem>> list() {
        List<OmsCartItem> cartItemList = cartItemService.list(memberService.getCurrentMember().getId());
        return CommonResult.success(cartItemList);
    }

    // 获取某个会员的购物车列表,包括促销信息")
    @GetMapping("/list/promotion")
    public CommonResult<List<CartPromotionItem>> listPromotion() {
        List<CartPromotionItem> cartPromotionItemList = cartItemService.listPromotion(memberService.getCurrentMember().getId());
        return CommonResult.success(cartPromotionItemList);
    }

    // 修改购物车中某个商品的数量")
    @GetMapping("/update/quantity")
    public CommonResult updateQuantity(@RequestParam Long id,
                                       @RequestParam Integer quantity) {
        int count = cartItemService.updateQuantity(id, memberService.getCurrentMember().getId(), quantity);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    // 获取购物车中某个商品的规格,用于重选规格")
    @GetMapping("/getProduct/{productId}")
    public CommonResult<CartProduct> getCartProduct(@PathVariable Long productId) {
        CartProduct cartProduct = cartItemService.getCartProduct(productId);
        return CommonResult.success(cartProduct);
    }

    // 修改购物车中商品的规格")
    @PostMapping(value = "/update/attr")
    public CommonResult updateAttr(@RequestBody OmsCartItem cartItem) {
        int count = cartItemService.updateAttr(cartItem);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    // 删除购物车中的某个商品")
    @PostMapping(value = "/delete")
    public CommonResult delete(@RequestParam("ids") List<Long> ids) {
        int count = cartItemService.delete(memberService.getCurrentMember().getId(), ids);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    // 清空购物车")
    @PostMapping("/clear")
    public CommonResult clear() {
        int count = cartItemService.clear(memberService.getCurrentMember().getId());
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }
}
