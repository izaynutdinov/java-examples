/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.project_management.jsf.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import net.iskandar.examples.project_management.dao.EmployeeDao;
import net.iskandar.examples.project_management.domain.Employee;
import net.iskandar.examples.project_management.service.ProjectManagementService;
import static net.iskandar.examples.shared.validator.Utils.*;


/**
 *
 * @author iskandar
 */
@FacesValidator(value = "login")
public class LoginValidator extends BaseValidator implements Validator {

    private static final String EMPLOYEE_ID_ATTR_NAME = "employeeId";
    
    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        if(value instanceof String){
            String str = (String) value;
            Integer employeeId = (Integer) component.getAttributes().get(EMPLOYEE_ID_ATTR_NAME);
            ProjectManagementService projectManagementService = getProjectManagementService(context);            
            if(projectManagementService.loginExist(str, employeeId)){
                throw new ValidatorException(createErrorMessage("Login already exist in database"));
            }
        }
    }

    
}
