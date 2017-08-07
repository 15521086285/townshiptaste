package com.pc.publicclass.util.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
/**
 * session拦截器
 * @author Administrator
 *
 */
public class SessionInterceptor extends HandlerInterceptorAdapter{

  
    /**
     * 检查session是否过期  
     */
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)  
            throws Exception {
    		String userName = (String) request.getSession().getAttribute("userName");
    		if(userName == null){
    			return false;
    		}
    		return true;  
    }  
  
    @Override  
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,  
            ModelAndView modelAndView) throws Exception {  
  
    }  
  
    @Override  
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)  
            throws Exception {  
    }   
}
