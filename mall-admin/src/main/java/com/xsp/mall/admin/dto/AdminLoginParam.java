package com.xsp.mall.admin.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
@Getter
@Setter
public class AdminLoginParam {

    @NotEmpty
    private String username;
    @NotEmpty
    private String password;
}
