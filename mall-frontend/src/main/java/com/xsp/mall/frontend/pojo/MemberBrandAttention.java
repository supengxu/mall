package com.xsp.mall.frontend.pojo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * 会员关注的品牌
 * Created by xsp on 2018/8/2.
 */
@Getter
@Setter
public class MemberBrandAttention {
    @Id
    private String id;
    private Long memberId;
    private String memberNickname;
    private String memberIcon;
    private Long brandId;
    private String brandName;
    private String brandLogo;
    private String brandCity;
    private Integer brandAttentionCount;
    private Date createTime;
}
