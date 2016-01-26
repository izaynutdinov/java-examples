/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.project_management;

/**
 *
 * @author iskandar
 */
public class ProjectManagementException extends RuntimeException {

    public ProjectManagementException() {
    }

    public ProjectManagementException(String message) {
        super(message);
    }

    public ProjectManagementException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProjectManagementException(Throwable cause) {
        super(cause);
    }

    public ProjectManagementException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
