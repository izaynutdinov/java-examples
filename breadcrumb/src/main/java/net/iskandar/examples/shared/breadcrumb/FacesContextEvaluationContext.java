/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.shared.breadcrumb;

import javax.faces.context.FacesContext;

/**
 *
 * @author iskandar
 */

public class FacesContextEvaluationContext implements EvaluationContext {

    @Override
    public Object getObject(String name) {
        return FacesContext.getCurrentInstance().getApplication().evaluateExpressionGet(
                FacesContext.getCurrentInstance(), "#{" + name + "}", Object.class);
    }

}
