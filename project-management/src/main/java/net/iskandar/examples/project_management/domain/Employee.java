/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.project_management.domain;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import org.apache.commons.codec.digest.DigestUtils;
import org.hibernate.search.annotations.Key;

/**
 *
 * @author iskandar
 */
@Entity
@Table(name = "EMPLOYEES")
public class Employee extends BaseEntity {

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "LOGIN")
    private String login;

    @Column(name = "PASSWORD_MD5", columnDefinition = "char")
    private String passwordMd5;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "DELETED")
    private Boolean deleted = false;

    @Column(name = "MODIFIED", columnDefinition = "timestamp")
    private Date modified = new Date();

    @ManyToMany
    @JoinTable(name = "EMPLOYEE_ROLES", 
            joinColumns = @JoinColumn(name = "EMPLOYEE_ID"), 
            inverseJoinColumns = @JoinColumn(name = "ROLE_ID"))
    @MapKey(name="code")
    private Map<String, Role> roles = new HashMap<>();

    @ManyToMany
    @JoinTable(name = "PROJECT_MEMBERS",
            joinColumns = @JoinColumn(name = "EMPLOYEE_ID"),
            inverseJoinColumns = @JoinColumn(name = "PROJECT_ID"))
    @OrderBy("title ASC")
    private List<Project> projects;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPasswordMd5() {
        return passwordMd5;
    }

    public void setPasswordMd5(String passwordMd5) {
        this.passwordMd5 = passwordMd5;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Map<String, Role> getRoles() {
        return roles;
    }

    public void setRoles(Map<String, Role> roles) {
        this.roles = roles;
    }

    public boolean hasRole(String roleCode) {
        return roles.containsKey(roleCode);
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    @PreUpdate
    public void preUpdate() {
        setModified(new Date());
    }

    public void setPassword(String password) {
        this.setPasswordMd5(DigestUtils.md2Hex(password));
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

}
