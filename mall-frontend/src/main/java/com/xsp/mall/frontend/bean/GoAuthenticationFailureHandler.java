package com.xsp.mall.frontend.bean;

import com.alibaba.fastjson.JSON;
import com.xsp.mall.result.CommonResult;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by xsp on 2018/8/6.
 */
public class GoAuthenticationFailureHandler implements AuthenticationFailureHandler {
    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
        response.setHeader("Content-Type", "application/json;charset=utf-8");
        response.getWriter().print(JSON.parse(String.valueOf(CommonResult.failed("登录失败：" + exception.getMessage()))));
        response.getWriter().flush();
    }
}
