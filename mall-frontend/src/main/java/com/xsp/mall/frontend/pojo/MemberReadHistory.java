package com.xsp.mall.frontend.pojo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * 用户商品浏览历史记录
 * Created by xsp on 2018/8/3.
 */
@Getter
@Setter
public class MemberReadHistory {
    @Id
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
