/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.shared.jsf.breadcrumb;

/**
 *
 * @author iskandar
 */
public class BreadCrumbException extends RuntimeException {

    public BreadCrumbException() {
    }

    public BreadCrumbException(String message) {
        super(message);
    }

    public BreadCrumbException(String message, Throwable cause) {
        super(message, cause);
    }

    public BreadCrumbException(Throwable cause) {
        super(cause);
    }

    public BreadCrumbException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
    
}
