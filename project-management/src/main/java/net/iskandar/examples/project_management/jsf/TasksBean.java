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
import net.iskandar.examples.project_management.dao.TaskDao;
import net.iskandar.examples.project_management.domain.Task;
import org.primefaces.model.LazyDataModel;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author iskandar
 */

@ManagedBean
@RequestScoped
public class TasksBean extends BaseListBean<Task> {

    @ManagedProperty("#{taskDao}")
    private TaskDao taskDao;

    public TaskDao getTaskDao() {
        return taskDao;
    }

    public void setTaskDao(TaskDao taskDao) {
        this.taskDao = taskDao;
    }

    @Override
    protected ListLoader<Task> getLoader() {
        return getTaskDao();
    }
    
    /**
     *
     * @return
     */
    public LazyDataModel getTasks(){
        return getLazyModel();
    }
    
}
