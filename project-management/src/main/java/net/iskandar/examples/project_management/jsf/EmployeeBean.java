/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.project_management.jsf;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.validation.constraints.Size;
import net.iskandar.examples.project_management.dao.EmployeeDao;
import net.iskandar.examples.project_management.dao.RoleDao;
import net.iskandar.examples.project_management.domain.Employee;
import net.iskandar.examples.project_management.domain.Role;
import net.iskandar.examples.project_management.jsf.breadcrumb.ViewEmployeeItem;
import net.iskandar.examples.project_management.service.ProjectManagementService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author iskandar
 */
@ManagedBean
@RequestScoped
public class EmployeeBean implements Serializable {

    private static final Logger log = LogManager.getLogger(EmployeeBean.class);

    @ManagedProperty("#{employeeDao}")
    private EmployeeDao employeeDao;

    @ManagedProperty("#{projectManagementService}")
    private ProjectManagementService service;
    
    @ManagedProperty("#{breadCrumbBean}")
    private BreadCrumbBean breadCrumbBean;

    @ManagedProperty("#{roleDao}")
    private RoleDao roleDao;

    private Integer employeeId;
    private Employee employee;

    @Size(min = 3, max = 15, message = "Enter the value between 3 and 15 characters")
    private String login;

    @Size(min = 3, max = 15, message = "Enter the value between 3 and 15 characters")
    private String firstName;
    
    @Size(min = 3, max = 15, message = "Enter the value between 3 and 15 characters")
    private String lastName;
    
    @Size(min = 8, message = "Password must contain at least 8 character")
    private String password;
    
    private String newPassword;

    private String confirmPassword;
    
/*    @Pattern(regexp = "^[\\\\w\\\\-]([\\\\.\\\\w])+[\\\\w]+@([\\\\w\\\\-]+\\\\.)+[A-Z]{2,4}$",
                message = "Please enter valid email address")*/
    private String email;
    
    private String newEmail;

    private String confirmEmail;
    
    private Role[] selectedRoles;
    
    private List<Role> roles;

    public EmployeeDao getEmployeeDao() {
        return employeeDao;
    }

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public RoleDao getRoleDao() {
        return roleDao;
    }

    public void setRoleDao(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public ProjectManagementService getService() {
        return service;
    }

    public void setService(ProjectManagementService service) {
        this.service = service;
    }

    public BreadCrumbBean getBreadCrumbBean() {
        return breadCrumbBean;
    }

    public void setBreadCrumbBean(BreadCrumbBean breadCrumbBean) {
        this.breadCrumbBean = breadCrumbBean;
    }

    public void setEmployeeId(Integer employeeId) {
        log.debug("setEmployeeId id=" + employeeId);
        this.employeeId = employeeId;
    }

    public Employee getEmployee() {
        if (employee == null) {
            if (employeeId != null) {
                employee = employeeDao.get(employeeId);
            }
        }
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getLogin() {
        if(login == null && employeeId != null){
            login = getEmployee().getLogin();
        }
        return login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }

    public String getFirstName() {
        if(firstName == null && employeeId != null)
            firstName = getEmployee().getFirstName();
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        if(lastName == null && employeeId != null)
            lastName = getEmployee().getLastName();
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getEmail() {
        if(email == null && employeeId != null)
           email = getEmployee().getEmail();
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNewEmail() {
        return newEmail;
    }

    public void setNewEmail(String newEmail) {
        this.newEmail = newEmail;
    }

    public String getConfirmEmail() {
        return confirmEmail;
    }

    public void setConfirmEmail(String confirmEmail) {
        this.confirmEmail = confirmEmail;
    }

    public Role[] getSelectedRoles() {
        if(selectedRoles == null && getEmployee() != null){
            selectedRoles = new Role[getEmployee().getRoles().size()];
            int i = 0;
            for(Role r : getEmployee().getRoles().values()){
                selectedRoles[i++]  = r;
            }
        }
        return selectedRoles;
    }

    public void setSelectedRoles(Role[] selectedRoles) {
        this.selectedRoles = selectedRoles;
    }

    public List<Role> getRoles() {
        if(roles == null)
            roles = roleDao.list();
        return roles;
    }
    
    public String createEmployee(){
        Employee employee = new Employee();
        employee.setLogin(login);
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setPassword(password);
        employee.setEmail(email);
        service.createEmployee(employee);
        return breadCrumbBean.replaceCurrent(new ViewEmployeeItem(employee.getId()));
    }

    public String updateEmployee(){
        log.debug("updateEmployee");
        Employee employee = new Employee();
        employee.setId(employeeId);
        employee.setLogin(login);
        for(Role r : selectedRoles){
            employee.getRoles().put(r.getCode(), r);
        }
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        log.debug("newEmail=" + newEmail);
        if(newEmail != null && !"".equals(newEmail)){
            log.debug("setting new email");
            employee.setEmail(newEmail);
        }
        if(newPassword != null && !"".equals(newPassword)){
            employee.setPassword(newPassword);
        }
        service.updateEmployee(employee);
        return breadCrumbBean.navigateBack();
    }
    


}
