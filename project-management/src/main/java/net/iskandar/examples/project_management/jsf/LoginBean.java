/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.project_management.jsf;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import net.iskandar.examples.project_management.authentication.AuthenticationContext;
import net.iskandar.examples.project_management.authentication.UserHolder;
import net.iskandar.examples.project_management.dao.EmployeeDao;
import net.iskandar.examples.project_management.domain.Employee;

/**
 *
 * @author iskandar
 */
@ManagedBean
@RequestScoped
public class LoginBean {
    
    @ManagedProperty("#{breadCrumbBean}")
    private BreadCrumbBean breadCrumbBean;

    @ManagedProperty("#{employeeDao}")
    private EmployeeDao employeeDao;

    private Integer employeeId;
    private List<Employee> employees;

    public LoginBean() {
        FacesContext context = FacesContext.getCurrentInstance();
        HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();
        employeeId = AuthenticationContext.getUserId(request);
    }

    public BreadCrumbBean getBreadCrumbBean() {
        return breadCrumbBean;
    }

    public void setBreadCrumbBean(BreadCrumbBean breadCrumbBean) {
        this.breadCrumbBean = breadCrumbBean;
    }

    public EmployeeDao getEmployeeDao() {
        return employeeDao;
    }

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public List<Employee> getEmployees() {
        if(employees == null)
            employees = employeeDao.list();
        return employees;
    }
    
    public String signIn(){
        FacesContext context = FacesContext.getCurrentInstance();
        HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();
        AuthenticationContext.setUserId(request, employeeId);
        return breadCrumbBean.refresh();
    }
    
    public Employee getEmployee(){
        return UserHolder.getUser();
    }

}
