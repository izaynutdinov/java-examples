/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.shared.validator;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.primefaces.component.fileupload.FileUpload;

/**
 *
 * @author iskandar
 */
@FacesValidator(value = "fileUploadRequired")
public class FileUploadValidator implements Validator {

    private static final Logger log = LogManager.getLogger(FileUploadValidator.class);

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        log.debug("validate");
        log.debug("component.class.name=" + component.getClass().getName());
        if(component instanceof FileUpload){
            FileUpload fileUpload = (FileUpload) component;
            log.debug("fileUpload.value.class.name=" + fileUpload.getValue().getClass().getName());
        }
    }

}
