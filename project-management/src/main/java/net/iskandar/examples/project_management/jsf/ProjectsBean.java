/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.project_management.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import net.iskandar.examples.project_management.dao.ListLoader;
import net.iskandar.examples.project_management.dao.ProjectDao;
import net.iskandar.examples.project_management.domain.Project;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.primefaces.model.LazyDataModel;

/**
 *
 * @author iskandar
 */
@ManagedBean
@RequestScoped
public class ProjectsBean extends BaseListBean<Project> {
 
    private static final Logger log = LogManager.getLogger(ProjectsBean.class);
    
    @ManagedProperty("#{projectDao}")
    private ProjectDao projectDao;

    public ProjectDao getProjectDao() {
        return projectDao;
    }

    public void setProjectDao(ProjectDao projectDao) {
        this.projectDao = projectDao;
    }

    @Override
    protected ListLoader<Project> getLoader() {
        return getProjectDao();
    }
    
    public LazyDataModel<Project> getProjects(){
        return getLazyModel();
    }
    
}
