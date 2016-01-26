/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.shared.validator;

import java.util.HashSet;
import java.util.Set;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author iskandar
 */

public class BasePasswordValidator implements Validator {

    private boolean required;

    protected boolean isRequired() {
        return required;
    }

    protected void setRequired(boolean required) {
        this.required = required;
    }
    
    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        if (value instanceof String) {
            String str = (String) value;
            if(!required && "".equals(str))
                return;
            if(str.length() < 8){
                throw new ValidatorException(createErrorMessage("Password must be at least 8 character long"));
            }
            int countLC = 0;
            int countUC = 0;
            int countDigit = 0;

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (Character.isLowerCase(ch)) {
                    countLC++;
                } else if (Character.isUpperCase(ch)) {
                    countUC++;
                } else if (Character.isDigit(ch)) {
                    countDigit++;
                }
            }
            if (countDigit == 0 || countLC == 0) {
                throw new ValidatorException(createErrorMessage("Password must contain at least one lower case letter and one digit!"));
            }
        }
    }

    private static FacesMessage createErrorMessage(String message) {
        FacesMessage facesMessage = new FacesMessage();
        facesMessage.setDetail(message);
        facesMessage.setSummary(message);
        facesMessage.setSeverity(FacesMessage.SEVERITY_ERROR);
        return facesMessage;
    }

}
