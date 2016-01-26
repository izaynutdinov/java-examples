/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.project_management.authentication;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import net.iskandar.examples.project_management.dao.EmployeeDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author iskandar
 */
@Component(value = "authenticationFilter")
@Scope("singleton")
public class AuthenticationFilter implements Filter {

    private static final Logger log = LogManager.getLogger(AuthenticationFilter.class);

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, 
                           FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        log.debug(httpServletRequest.getMethod());
        Integer userId = AuthenticationContext.getUserId(httpServletRequest);
        if(userId == null){
            userId = 1;
            AuthenticationContext.setUserId(httpServletRequest, userId);
            log.debug(httpServletRequest.getContextPath());
            log.debug(httpServletRequest.getServletPath());
            log.debug(httpServletRequest.getRequestURI());
        }
        UserHolder.setUser(employeeDao.get(userId));
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
    }
    
}
