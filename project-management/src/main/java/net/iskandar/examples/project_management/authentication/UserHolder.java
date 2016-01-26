/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.project_management.authentication;

import net.iskandar.examples.project_management.domain.Employee;

/**
 *
 * @author iskandar
 */
public class UserHolder {

    private static ThreadLocal<Employee> user = new ThreadLocal<Employee>();

    static void setUser(Employee employee){
        user.set(employee);
    }

    public static Employee getUser(){
        return user.get();
    }
    
}
