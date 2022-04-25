package com.example.config;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class MyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String uri = request.getRequestURI();

        // 是否登录
        Object loginUser = request.getSession().getAttribute("uName");

        if(uri.startsWith("/admin") && null == loginUser){
            response.sendRedirect("/login");
            return false;
        }
        return true;
    }
}
