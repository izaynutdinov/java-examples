/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.shared.validator;

import java.util.Date;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static net.iskandar.examples.shared.validator.Utils.*;

/**
 *
 * @author iskandar
 */
@FacesValidator(value = "dateAfter")
public class DateAfterValidator implements Validator {

    private static final Logger log = LogManager.getLogger(DateAfterValidator.class);

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        log.debug(component.getClass().getName());
        String startDateId = (String) component.getAttributes().get("startDateId");
        log.debug("startDateId=" + startDateId);
        UIInput startDateComponent = (UIInput) context.getViewRoot().findComponent(startDateId);
        log.debug("startDate.value=" + startDateComponent.getValue());
        Date startDate = (Date) startDateComponent.getValue();
        log.debug(((UIInput) component).getValue());
        Date endDate = (Date) value;
        if(startDate.compareTo(endDate) >= 0){
            log.error("startDate after endDate");
            throw new ValidatorException(createErrorMessage("End Date must be after Start Date"));
        }
        
        
    }
    
}
