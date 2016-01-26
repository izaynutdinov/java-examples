/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.project_management.authentication;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author iskandar
 */
public class AuthenticationContext {
 
    private static final String USER_ID_ATTR  = AuthenticationContext.class.getPackage().getName() + "_USER_ID";
    
    public static Integer getUserId(HttpServletRequest httpServletRequest){
        return (Integer) httpServletRequest.getSession().getAttribute(USER_ID_ATTR);
    }
    
    public static void setUserId(HttpServletRequest httpServletRequest, Integer userId){
        httpServletRequest.getSession().setAttribute(USER_ID_ATTR, userId);
    }
    
}
