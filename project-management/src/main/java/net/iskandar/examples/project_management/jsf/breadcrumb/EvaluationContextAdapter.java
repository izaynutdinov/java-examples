/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.project_management.jsf.breadcrumb;

import net.iskandar.examples.project_management.dao.EmployeeDao;
import net.iskandar.examples.project_management.dao.ProjectDao;
import net.iskandar.examples.project_management.dao.TaskDao;
import net.iskandar.examples.project_management.domain.Employee;
import net.iskandar.examples.project_management.domain.Project;
import net.iskandar.examples.project_management.domain.Task;
import net.iskandar.examples.project_management.jsf.EmployeeBean;
import net.iskandar.examples.project_management.jsf.ProjectBean;
import net.iskandar.examples.project_management.jsf.TaskBean;
import net.iskandar.examples.shared.breadcrumb.EvaluationContext;

/**
 *
 * @author iskandar
 */
public class EvaluationContextAdapter {
    
    private static final String PROJECT_BEAN_NAME = "projectBean";
    private static final String EMPLOYEE_BEAN_NAME = "employeeBean";
    private static final String PROJECT_DAO_NAME = "projectDao";
    private static final String EMPLOYEE_DAO_NAME = "employeeDao";
    private static final String TASK_BEAN_NAME = "taskBean";
    private static final String TASK_DAO_NAME = "taskDao";
    
    private EvaluationContext context;

    public EvaluationContextAdapter(EvaluationContext context) {
        this.context = context;
    }

    public void setProjectId(Integer projectId){
        ProjectBean projectBean = (ProjectBean) context.getObject(PROJECT_BEAN_NAME);
        projectBean.setProjectId(projectId);
    }
    
    public void setEmployeeId(Integer employeeId){
        EmployeeBean employeeBean = (EmployeeBean) context.getObject(EMPLOYEE_BEAN_NAME);
        employeeBean.setEmployeeId(employeeId);
    }
    
    public Project getProject(Integer id){
        ProjectDao projectDao = (ProjectDao) context.getObject(PROJECT_DAO_NAME);
        return projectDao.get(id);
    }
    
    public Employee getEmployee(Integer id){
        EmployeeDao employeeDao = (EmployeeDao) context.getObject(EMPLOYEE_DAO_NAME);
        return employeeDao.get(id);
    }
    
    public Task getTask(Integer taskId){
        TaskDao taskDao = (TaskDao) context.getObject(TASK_DAO_NAME);
        return taskDao.get(taskId);
    }
    
    public void setTaskId(Integer taskId){
        TaskBean taskBean = (TaskBean) context.getObject(TASK_BEAN_NAME);
        taskBean.setTaskId(taskId);
    }
    
}
