/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.project_management.jsf;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import net.iskandar.examples.project_management.dao.RoleDao;
import net.iskandar.examples.project_management.domain.Role;

/**
 *
 * @author iskandar
 */
@ManagedBean
@ApplicationScoped
public class ConverterBean {

    @ManagedProperty("#{roleDao}")
    private RoleDao roleDao;

    public RoleDao getRoleDao() {
        return roleDao;
    }

    public void setRoleDao(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    public Converter getRoleConverter(){
        return new Converter() {
            @Override
            public Object getAsObject(FacesContext context, UIComponent component, String value) {
                Integer roleId = Integer.parseInt(value);
                return roleDao.get(roleId);
            }

            @Override
            public String getAsString(FacesContext context, UIComponent component, Object value) {
                Role role = (Role) value;
                return role.getId().toString();
            }
        };
    }
    
}
