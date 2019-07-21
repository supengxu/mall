package com.xsp.mall.admin.dto;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotBlank;

/**
 * 用户登录参数
 * Created by xsp on 2018/4/26.
 */
@Getter
@Setter
public class UmsAdminLoginParam {
    // value = "用户名", required = true)
    @NotBlank(message = "用户名不能为空")
    private String username;
    // value = "密码", required = true)
    @NotBlank(message = "密码不能为空")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
