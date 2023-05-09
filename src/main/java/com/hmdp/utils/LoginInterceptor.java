package com.hmdp.utils;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //1.判断是否拦截（ThreadLocal中是否有该用户）
        if(UserHolder.getUser()==null){
            //没有，拦截
            response.setStatus(401);
            return false;
        }
        return true;
    }
}
