/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.project_management.jsf.breadcrumb;

import net.iskandar.examples.project_management.domain.Employee;
import net.iskandar.examples.shared.jsf.breadcrumb.EvaluationContext;

/**
 *
 * @author iskandar
 */
public class EditEmployeeItem extends BaseEmployeeItem {

    public EditEmployeeItem() {
        super("editEmployee");
    }

    public EditEmployeeItem(Integer employeeId) {
        super("editEmployee", employeeId);
    }
    
    @Override
    protected String createLabel() {
        Employee employee = getAdapter().getEmployee(getEmployeeId());
        return "Edit Employee [" + employee.getLogin() + "]";
    }
    
}
