package com.xsp.mall.service.impl;

import com.xsp.mall.mapper.AdminMapper;
import com.xsp.mall.pojo.Admin;
import com.xsp.mall.utils.TokenUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UmsAdminServiceImpl implements com.xsp.mall.service.AdminService {

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    AdminMapper adminMapper;
    @Autowired
    UmsAdminDetailServiceImpl adminDetailService;

    @Autowired
    TokenUtils tokenUtils;

    @Override
    public Admin getAdminByUserName(String username) {

        return adminMapper.findAdminByName(username);
    }

    @Override
    public String Login(String username, String password) {
        String token = null;
        System.out.println("我简历了");
        UserDetails userDetails = adminDetailService.loadUserByUsername(username);
        if (!passwordEncoder.matches(password, userDetails.getPassword())) {
            throw new BadCredentialsException("密码不正确");
        }
        UsernamePasswordAuthenticationToken authenticationToken =
                new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(authenticationToken);
        token = tokenUtils.generateToken(userDetails);

//        insertLoginLog(username);
        return token;
    }

//    /**
//     * 添加登录记录
//     * @param username 用户名
//     */
//    private void insertLoginLog(String username) {
//        Admin admin = getAdminByUserName(username);
//        UmsAdminLoginLog loginLog = new UmsAdminLoginLog();
//        loginLog.setAdminId(admin.getId());
//        loginLog.setCreateTime(new Date());
//        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
//        HttpServletRequest request = attributes.getRequest();
//        loginLog.setIp(request.getRemoteAddr());
//        loginLogMapper.insert(loginLog);
//    }
}
