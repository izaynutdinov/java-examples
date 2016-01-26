/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.project_management.authentication;

import net.iskandar.examples.project_management.ProjectManagementException;
import net.iskandar.examples.project_management.domain.Employee;
import net.iskandar.examples.project_management.domain.Project;
import net.iskandar.examples.project_management.domain.Task;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author iskandar
 */
@Component
@Scope("singleton")
public class Authenticator {
    
    public static final String USER = "USER";
    public static final String MANAGER = "MANAGER";
    public static final String MEMBER = "MEMBER";
    public static final String ASSIGNEE = "ASSIGNEE";

    public boolean hasRole(String roleName){
        Employee employee = UserHolder.getUser();
        if(employee != null){
            if(USER.equals(roleName)) // Every user has USER role
                return true;
            return employee.hasRole(roleName);
        }
        return false;
    }

    public boolean hasRole(Object object, String roleName){
        if(object instanceof Project){
            Project project = (Project) object;
            if(MANAGER.equals(roleName)){
                return UserHolder.getUser().equals(project.getManager());
            } else if (MEMBER.equals(roleName)){
                return project.hasMember(UserHolder.getUser());
            }
            return false;
        } else if(object instanceof Task){
            Task task = (Task) object;
            if(MANAGER.equals(roleName)){
                return UserHolder.getUser().equals(task.getProject().getManager());
            } else if(ASSIGNEE.equals(roleName)){
                return UserHolder.getUser().equals(task.getAssignee());
            }
        }
        return false;
    }
    
    public void authenticate(String roleCode) throws ProjectManagementException {
        if(!hasRole(roleCode))
            throw new ProjectManagementException("Permission denied");
    }
    
    public void authenticate(Object object, String roleCode) throws ProjectManagementException {
        if(!hasRole(object, roleCode))
            throw new ProjectManagementException("Permission denied");
    }
}
