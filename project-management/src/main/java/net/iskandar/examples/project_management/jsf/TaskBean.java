/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.project_management.jsf;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.validation.constraints.Size;
import net.iskandar.examples.project_management.dao.EmployeeDao;
import net.iskandar.examples.project_management.dao.ProjectDao;
import net.iskandar.examples.project_management.dao.TaskDao;
import net.iskandar.examples.project_management.domain.Employee;
import net.iskandar.examples.project_management.domain.Project;
import net.iskandar.examples.project_management.domain.Task;
import net.iskandar.examples.project_management.jsf.breadcrumb.ViewTaskItem;
import net.iskandar.examples.project_management.service.ProjectManagementService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author iskandar
 */
@ManagedBean
@RequestScoped
public class TaskBean {
    
    private static final Logger log = LogManager.getLogger(TaskBean.class);

    private Integer taskId;
    private Task task;

    @Size(min=1, max=512, message = "Title must be not longer than 512 characters")
    private String title;
    private String description;
    private Integer projectId;
    private Integer assigneeId;
    private String status;
    private Date startDate;
    private Date endDate;

    @ManagedProperty("#{taskDao}")
    private TaskDao taskDao;

    @ManagedProperty("#{projectDao}")
    private ProjectDao projectDao;

    @ManagedProperty("#{employeeDao}")
    private EmployeeDao employeeDao;

    @ManagedProperty("#{projectManagementService}")
    private ProjectManagementService service;

    @ManagedProperty("#{breadCrumbBean}")
    private BreadCrumbBean breadCrumbBean;

    private List<Project> projects;
    
    private Project project;

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Task getTask() {
        if(task == null && taskId != null){
            task = taskDao.get(taskId);
        }
        return task;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getProjectId() {
        if(projectId == null)
            initFields();
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
        this.project = null;
    }

    public Integer getAssigneeId() {
        if(assigneeId == null)
            initFields();
        return assigneeId;
    }

    public void setAssigneeId(Integer assigneeId) {
        this.assigneeId = assigneeId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getStartDate() {
        if(startDate == null)
            initFields();
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        if(endDate == null)
            initFields();
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public ProjectDao getProjectDao() {
        return projectDao;
    }

    public void setProjectDao(ProjectDao projectDao) {
        this.projectDao = projectDao;
    }

    public EmployeeDao getEmployeeDao() {
        return employeeDao;
    }

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
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

    public List<Project> getProjects() {
        if(projects == null){
            projects = projectDao.list();
        }
        return projects;
    }

    public List<Employee> getMembers() {
        log.debug("getMembers");
        Project project = getProject();
        if(project != null){
            log.debug("project != null");
            return project.getMembers();
        }
        return new ArrayList<Employee>();
    }

    public Project getProject() {
        Integer projectId = getProjectId();
        if(project == null && projectId != null){
            project = projectDao.get(projectId);
        }
        return project;
    }

    public TaskDao getTaskDao() {
        return taskDao;
    }

    public void setTaskDao(TaskDao taskDao) {
        this.taskDao = taskDao;
    }
    
    public String createTask(){
        Task task = new Task();
        task.setTitle(title);
        task.setDescription(description);
        task.setProject(projectDao.get(projectId));
        task.setAssignee(employeeDao.get(assigneeId));
        task.setStartDate(startDate);
        task.setEndDate(endDate);
        return breadCrumbBean.replaceCurrent(new ViewTaskItem(service.createTask(task)));
    }
    
    public String updateTask(){
        Task task = new Task();
        task.setId(getTaskId());
        task.setAssignee(employeeDao.get(assigneeId));
        task.setStartDate(startDate);
        task.setEndDate(endDate);
        service.updateTask(task);
        return breadCrumbBean.navigateBack();
    }
    
    private void initFields(){
        Task task = getTask();
        if(task != null){
            projectId = task.getProject().getId();
            project = null;
            assigneeId = task.getAssignee().getId();
            startDate = task.getStartDate();
            endDate = task.getEndDate();
        }
    }

}
