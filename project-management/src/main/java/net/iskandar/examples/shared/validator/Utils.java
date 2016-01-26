/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.shared.validator;

import javax.faces.application.FacesMessage;

/**
 *
 * @author iskandar
 */
public class Utils {
    public static FacesMessage createErrorMessage(String message){
        FacesMessage facesMessage = new FacesMessage();
        facesMessage.setDetail(message);
        facesMessage.setSummary(message);
        facesMessage.setSeverity(FacesMessage.SEVERITY_ERROR);
        return facesMessage;        
    }
}
