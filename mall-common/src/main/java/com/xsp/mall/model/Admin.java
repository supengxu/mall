package com.xsp.mall.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Component
public class Admin implements Serializable {
    private Long id;
    // 用户名
    private String username;

    private String password;

    // 头像
    private String icon;

    // 邮箱
    private String email;

    // 昵名
    private String nickName;

    // 备注
    private String note;

    // 创建时间
    private Date createTime;

    // 最后登录时间
    private Date loginTime;

    // 帐号启用状态：0->禁用；1->启用
    private Integer status;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", icon=").append(icon);
        sb.append(", email=").append(email);
        sb.append(", nickName=").append(nickName);
        sb.append(", note=").append(note);
        sb.append(", createTime=").append(createTime);
        sb.append(", loginTime=").append(loginTime);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}
