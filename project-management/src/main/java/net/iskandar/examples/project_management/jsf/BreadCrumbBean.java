/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.project_management.jsf;

import java.io.IOException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import net.iskandar.examples.project_management.domain.Employee;
import net.iskandar.examples.project_management.domain.Project;
import net.iskandar.examples.project_management.domain.Task;
import net.iskandar.examples.project_management.jsf.breadcrumb.AddEmployeeItem;
import net.iskandar.examples.project_management.jsf.breadcrumb.AddProjectItem;
import net.iskandar.examples.project_management.jsf.breadcrumb.AddTaskItem;

import net.iskandar.examples.project_management.jsf.breadcrumb.EditEmployeeItem;
import net.iskandar.examples.project_management.jsf.breadcrumb.EditProjectItem;
import net.iskandar.examples.project_management.jsf.breadcrumb.EditTaskItem;
import net.iskandar.examples.project_management.jsf.breadcrumb.EmployeesItem;
import net.iskandar.examples.project_management.jsf.breadcrumb.ProjectsItem;
import net.iskandar.examples.project_management.jsf.breadcrumb.TasksItem;
import net.iskandar.examples.project_management.jsf.breadcrumb.ViewEmployeeItem;
import net.iskandar.examples.project_management.jsf.breadcrumb.ViewProjectItem;
import net.iskandar.examples.project_management.jsf.breadcrumb.ViewTaskItem;
import net.iskandar.examples.shared.breadcrumb.BreadCrumb;
import net.iskandar.examples.shared.breadcrumb.Item;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author iskandar
 */
@Component
@Scope(value = "request")
public class BreadCrumbBean extends BreadCrumb {

    private static final Logger log = LogManager.getLogger(BreadCrumbBean.class);
    
    private Integer id;

    static {
       /*
          NEVER CHANGE Class registration order because this will affect 
          breadcrumb persistence and will make incompatible breadcrumb tokens bookmarked by users.
          Always add new class registration at the end of this block.
        */ 
       Item.registerClass(ViewEmployeeItem.class);
       Item.registerClass(EditEmployeeItem.class);
       Item.registerClass(ViewProjectItem.class);
       Item.registerClass(EditProjectItem.class);
       Item.registerClass(ProjectsItem.class);
       Item.registerClass(EmployeesItem.class);
       Item.registerClass(AddEmployeeItem.class);
       Item.registerClass(AddProjectItem.class);
       Item.registerClass(TasksItem.class);
       Item.registerClass(AddTaskItem.class);
       Item.registerClass(EditTaskItem.class);
       Item.registerClass(ViewTaskItem.class);

    }    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BreadCrumbBean() {
    }

    private String getStateSingleton(Item item){
        return createSingleton(item).getState();
    }

    public String getStateEmployees(){
        return getStateSingleton(new EmployeesItem());
    }

    public String getStateViewEmployee(Employee emp){
        return getStateWithAddon(new ViewEmployeeItem(emp.getId()));
    }
    
    public String getStateEditEmployee(Employee emp){
        return getStateWithAddon(new EditEmployeeItem(emp.getId()));
    }
    
    public String getStateAddEmployee(){
        return getStateWithAddon(new AddEmployeeItem());
    }
    
    public String getStateAddProject(){
        return getStateWithAddon(new AddProjectItem());
    }

    public String getStateProjects(){
        return getStateSingleton(new ProjectsItem());
    }

    public String getStateViewProject(Project project){
        return getStateWithAddon(new ViewProjectItem(project.getId()));
    }

    public String getStateEditProject(Project project){
        return getStateWithAddon(new EditProjectItem(project.getId()));
    }
    
    public String getStateTasks(){
        return getStateSingleton(new TasksItem());
    }
    
    public String getStateViewTask(Task task){
        return getStateWithAddon(new ViewTaskItem(task.getId()));
    }
    
    public String getStateEditTask(Task task){
        return getStateWithAddon(new EditTaskItem(task.getId()));
    }
    
    public String getStateAddTask(){
        return getStateWithAddon(new AddTaskItem());
    }

    public String login(Employee emp){
        log.debug("login emp.login=" + emp.getLogin());
        return emp.getLogin();
    }

    public String toEditEmployee(Integer employeeId){
        return addItemNavigate(new EditEmployeeItem(employeeId));
    }

    @Override
    public void setState(String state) throws IOException, InstantiationException, IllegalAccessException {
        log.debug("setState state=" + state);
        super.setState(state); //To change body of generated methods, choose Tools | Templates.
    }

}
