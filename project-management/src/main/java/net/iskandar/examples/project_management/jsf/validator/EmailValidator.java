/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.project_management.jsf.validator;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import net.iskandar.examples.project_management.dao.EmployeeDao;
import net.iskandar.examples.project_management.service.ProjectManagementService;
import static net.iskandar.examples.shared.validator.Utils.createErrorMessage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author iskandar
 */
@FacesValidator(value = "emailExist")
public class EmailValidator extends BaseValidator implements Validator {

    private static final Logger log = LogManager.getLogger(EmailValidator.class);
    private static final String EMPLOYEE_ID_ATTR_NAME = "employeeId";
    
    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        log.debug("validate");
        if(value instanceof String){
            String str = (String) value;
            Integer employeeId = (Integer) component.getAttributes().get(EMPLOYEE_ID_ATTR_NAME);
            ProjectManagementService projectManagementService = getProjectManagementService(context);            
            if(projectManagementService.emailExist(str, employeeId)){
                throw new ValidatorException(createErrorMessage("Email already exist in database"));
            }
        }
    }
    
}
