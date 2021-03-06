/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.project_management.jsf;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

import net.iskandar.examples.project_management.dao.EmployeeDao;
import net.iskandar.examples.project_management.dao.ListLoader;
import net.iskandar.examples.project_management.dao.PagingParams;
import net.iskandar.examples.project_management.domain.Employee;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortMeta;
import org.primefaces.model.SortOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 *
 * @author iskandar
 */
/*@Component
@Scope(scopeName = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)*/
@ManagedBean
@RequestScoped
public class EmployeesBean extends BaseListBean<Employee> {

    private static final Logger log = LogManager.getLogger(EmployeesBean.class);

    @ManagedProperty("#{employeeDao}")
    private EmployeeDao employeeDao;
    
    private List<Employee> selectedEmployees;

    public EmployeeDao getEmployeeDao() {
        return employeeDao;
    }

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public List<Employee> getSelectedEmployees() {
        return selectedEmployees;
    }

    public void setSelectedEmployees(List<Employee> selectedEmployees) {
        this.selectedEmployees = selectedEmployees;
    }

    @Override
    protected ListLoader<Employee> getLoader() {
        return getEmployeeDao();
    }
    
    public LazyDataModel<Employee> getEmployees(){
        return getLazyModel();
    }

}
