package com.xsp.mall.frontend.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * 用户收藏的商品
 * Created by xsp on 2018/8/2.
 */
@Getter
@Setter
public class MemberProductCollection {
    private String id;

    private Long memberId;
    private String memberNickname;
    private String memberIcon;

    private Long productId;
    private String productName;
    private String productPic;
    private String productSubTitle;
    private String productPrice;
    private Date createTime;

}
