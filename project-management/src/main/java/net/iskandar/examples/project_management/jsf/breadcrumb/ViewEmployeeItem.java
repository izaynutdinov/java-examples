/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.project_management.jsf.breadcrumb;

import net.iskandar.examples.project_management.domain.Employee;
import net.iskandar.examples.shared.breadcrumb.EvaluationContext;

/**
 *
 * @author iskandar
 */
public class ViewEmployeeItem extends BaseEmployeeItem {

    public ViewEmployeeItem() {
        super("viewEmployee");
    }

    public ViewEmployeeItem(Integer employeeId) {
        super("viewEmployee", employeeId);
    }

    @Override
    protected String createLabel() {
        Employee employee = getAdapter().getEmployee(getEmployeeId());
        return "View Employee [" + employee.getLogin() + "]";
    }
 
}
