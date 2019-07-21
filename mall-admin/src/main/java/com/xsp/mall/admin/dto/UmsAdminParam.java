package com.xsp.mall.admin.dto;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/**
 * 用户登录参数
 * Created by xsp on 2018/4/26.
 */
@Getter
@Setter
public class UmsAdminParam {
    // value = "用户名", required = true)
    @NotBlank(message = "用户名不能为空")
    private String username;
    // value = "密码", required = true)
    @NotBlank(message = "密码不能为空")
    private String password;
    // value = "用户头像")
    private String icon;
    // value = "邮箱")
    @Email(message = "邮箱格式不合法")
    private String email;
    // value = "用户昵称")
    private String nickName;
    // value = "备注")
    private String note;
}
