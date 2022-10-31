package com.huo.oauth2client01demo.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 小源同学
 * @Date 2022 01 16 17 10
 * @Describe Please describe the role of this class
 **/
@RestController
@RequestMapping(("/user"))
public class UserController {
    /**
     * 获取当前用户信息
     * @param authentication
     * @return
     */
    @RequestMapping("/getCurrentUser")
    public Object getCurrentUser(Authentication authentication) {
        return authentication;
    }
}
