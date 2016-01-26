/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.project_management.jsf.breadcrumb;

import java.io.DataInputStream;
import java.io.IOException;
import net.iskandar.examples.shared.jsf.breadcrumb.EvaluationContext;
import net.iskandar.examples.shared.jsf.breadcrumb.Item;

/**
 *
 * @author iskandar
 */
public abstract class BaseItem extends Item {

    private EvaluationContextAdapter adapter;

    public BaseItem(String viewName) {
        super(viewName);
    }

    protected EvaluationContextAdapter getAdapter(){
        if(adapter == null && getContext() != null){
            adapter = new EvaluationContextAdapter(getContext());
        }
        return adapter;
    }

    @Override
    public void applyToContext() {

    }

    @Override
    public void load(DataInputStream dis) throws IOException {

    }
    
    
    
}
