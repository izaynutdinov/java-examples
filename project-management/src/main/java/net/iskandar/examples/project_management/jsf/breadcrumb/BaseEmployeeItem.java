/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.project_management.jsf.breadcrumb;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import net.iskandar.examples.shared.jsf.breadcrumb.EvaluationContext;

/**
 *
 * @author iskandar
 */
public abstract class BaseEmployeeItem extends BaseItem {

    private Integer employeeId;

    public BaseEmployeeItem(String viewName) {
        super(viewName);
    }

    public BaseEmployeeItem(String viewName, Integer employeeId) {
        super(viewName);
        this.employeeId = employeeId;
    }

    protected Integer getEmployeeId() {
        return employeeId;
    }
    
    @Override
    public void applyToContext() {
        getAdapter().setEmployeeId(employeeId);
    }

    @Override
    public void load(DataInputStream dis) throws IOException{
        employeeId = dis.readInt();
    }

    @Override
    public void save(DataOutputStream dos) throws IOException {
        super.save(dos); //To change body of generated methods, choose Tools | Templates.
        dos.writeInt(employeeId);
    }

}
