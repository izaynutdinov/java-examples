/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.project_management.jsf.validator;

import javax.faces.context.FacesContext;
import net.iskandar.examples.project_management.dao.EmployeeDao;
import net.iskandar.examples.project_management.service.ProjectManagementService;

/**
 *
 * @author iskandar
 */
public class BaseValidator {
    
    protected ProjectManagementService getProjectManagementService(FacesContext context){
        ProjectManagementService projectManagementService = context.getApplication().evaluateExpressionGet(context, "#{projectManagementService}", ProjectManagementService.class);
        return projectManagementService;
    }
    
    protected EmployeeDao getEmployeeDao(FacesContext context){
        EmployeeDao employeeDao = context.getApplication().evaluateExpressionGet(context, "#{employeeDao}", EmployeeDao.class);
        return employeeDao;
    }
    
}
