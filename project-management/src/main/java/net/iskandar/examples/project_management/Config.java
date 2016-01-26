/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.project_management;

import javax.servlet.http.HttpServletRequest;
import net.iskandar.examples.project_management.authentication.AuthenticationContext;
import net.iskandar.examples.project_management.dao.EmployeeDao;
import net.iskandar.examples.project_management.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

/**
 *
 * @author iskandar
 */
@Configuration
public class Config {

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private EmployeeDao employeeDao;

    @Bean
    @Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
    public Employee currentUser(){
        Integer userId = AuthenticationContext.getUserId(request);
        return employeeDao.get(userId);
    }
    
}
