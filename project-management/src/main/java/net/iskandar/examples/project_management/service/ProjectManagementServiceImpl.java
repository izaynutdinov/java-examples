/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.project_management.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import net.iskandar.examples.project_management.ProjectManagementException;
import net.iskandar.examples.project_management.authentication.Authenticate;
import net.iskandar.examples.project_management.authentication.Authenticator;
import net.iskandar.examples.project_management.authentication.Param;
import net.iskandar.examples.project_management.authentication.UserHolder;
import net.iskandar.examples.project_management.dao.DocumentDao;
import net.iskandar.examples.project_management.dao.EmployeeDao;
import net.iskandar.examples.project_management.dao.ProjectDao;
import net.iskandar.examples.project_management.dao.ProjectDocumentDao;
import net.iskandar.examples.project_management.dao.ProjectMemberDao;
import net.iskandar.examples.project_management.dao.TaskDao;
import net.iskandar.examples.project_management.domain.Document;
import net.iskandar.examples.project_management.domain.Employee;
import net.iskandar.examples.project_management.domain.Project;
import net.iskandar.examples.project_management.domain.ProjectDocument;
import net.iskandar.examples.project_management.domain.ProjectMember;
import net.iskandar.examples.project_management.domain.Task;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author iskandar
 */
@Service(value = "projectManagementService")
public class ProjectManagementServiceImpl implements ProjectManagementService {

    private static final Logger log = LogManager.getLogger(ProjectManagementServiceImpl.class);

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private ProjectDao projectDao;

    @Autowired
    private ProjectMemberDao projectMemberDao;

    @Autowired
    private ProjectDocumentDao projectDocumentDao;

    @Autowired
    private TaskDao taskDao;
    
    @Autowired
    private DocumentDao documentDao;
    
    @Autowired
    private Authenticator authenticator;
    
    public ProjectManagementServiceImpl() {
        String userHome = System.getProperty("user.home");
        log.debug("User Home: " + userHome);
    }
    
    @Override
    @Transactional
    @Authenticate("hasRole('ADMIN')")
    public Integer createEmployee(Employee employee) throws ProjectManagementException {
        if(employee == null){
            throw new IllegalArgumentException("employee mustn't be null!");
        }
        if(employee.getId() != null){
            throw new ProjectManagementException("persistent Employee object passed to createEmployee");
        }
        employeeDao.persist(employee);
        return employee.getId();
    }

    @Override
    @Transactional
    @Authenticate("hasRole('ADMIN')")
    public void updateEmployee(Employee employee) throws ProjectManagementException {

        log.debug("updateEmployee");
        if(employee == null){
            throw new IllegalArgumentException("employee mustn't be null!");
        }
        if(employee.getId() == null){
            throw new ProjectManagementException("Non persistent Employee object passed to updateEmployee");
        }

        Employee emp = employeeDao.get(employee.getId());
        if(emp == null)
            throw new ProjectManagementException("employee not found");
        emp.setLogin(employee.getLogin());
        emp.setFirstName(employee.getFirstName());
        emp.setLastName(employee.getLastName());
        emp.setRoles(employee.getRoles());

        if(employee.getPasswordMd5() != null)
            emp.setPasswordMd5(employee.getPasswordMd5());
        log.debug("email=" + employee.getEmail());
        if(employee.getEmail() != null){
            emp.setEmail(employee.getEmail());
        }

    }

    @Override
    @Authenticate("hasRole('USER')")
    public boolean loginExist(String login, Integer employeeId) {
        Employee employee = employeeDao.getByLogin(login);
        if(employee != null){
            if(employeeId != null && employeeId.equals(employee.getId()))
                return false;
            return true;
        }
        return false;
    }

    @Override
    @Authenticate("hasRole('USER')")
    public boolean emailExist(String email, Integer employeeId) {
        Employee employee = employeeDao.getByEmail(email);
        if(employee != null){
            if(employeeId != null && employeeId.equals(employee.getId()))
                return false;
            return true;
        }
        return false;
    }

    @Override
    @Transactional
    @Authenticate("hasRole('MANAGER')")
    public Integer createProject(Project project) throws ProjectManagementException {
        if(project == null)
            throw new IllegalArgumentException("project mustn't be null");
        project.setManager(UserHolder.getUser());
        projectDao.persist(project);
        projectMemberDao.addMember(project, project.getManager());
        return project.getId();
    }

    @Override
    @Transactional
    public void updateProject(@Param("project") Project project) throws ProjectManagementException {
        if(project == null)
            throw new IllegalArgumentException("project mustn't be null");
        if(project.getId() == null)
            throw new ProjectManagementException("project.id mustn't be null when passed to updateProject");
        Project p = projectDao.get(project.getId());
        if(p == null)
            throw new ProjectManagementException("project not found");
        authenticator.authenticate(p, Authenticator.MANAGER);
        p.setTitle(project.getTitle());
        p.setDescription(project.getDescription());
        p.setStartDate(project.getStartDate());
        p.setEndDate(project.getEndDate());
        log.debug("project.manager=" + project.getManager().getFullName());
        if(!project.getManager().getId().equals(p.getManager().getId())){
            ProjectMember projectMember = projectMemberDao.findMember(p, project.getManager());
            if(projectMember == null){
                projectMemberDao.addMember(p, project.getManager());
            }
        }
        p.setManager(project.getManager());
    }

    @Override
    @Transactional
    @Authenticate("hasRole(#task, 'MANAGER')")
    public Integer createTask(@Param("task") Task task) throws ProjectManagementException {
        if(task == null)
            throw new IllegalArgumentException("task mustn't be null");
        taskDao.persist(task);
        return task.getId();
    }

    @Override
    @Transactional
    @Authenticate("hasRole(#task, 'ASSIGNEE') || #hasRole(task.project, 'MANAGER')")
    public void updateTask(@Param("task") Task task) throws ProjectManagementException {
        if(task == null)
            throw new IllegalArgumentException("task mustn't be null");
        if(task.getId() == null)
            throw new ProjectManagementException("task.id mustn't be null when passed to updateTask");
        Task t = taskDao.get(task.getId());
        t.setAssignee(task.getAssignee());
        t.setStartDate(task.getStartDate());
        t.setEndDate(task.getEndDate());
    }

    @Override
    @Transactional
    @Authenticate("hasRole(#project, 'MANAGER')")
    public void addMemberToProject(@Param("project") Project project, 
                          Integer employeeId) throws ProjectManagementException {
        if(project == null)
            throw new IllegalArgumentException("project cannot be null");

        if(employeeId == null)
            throw new IllegalArgumentException("employeeId cannot be null");

        Employee employee = employeeDao.get(employeeId);
        if(employee == null)
            throw new ProjectManagementException("employee not found");
        
        ProjectMember projectMember = projectMemberDao.findMember(project, employee);
        if(projectMember != null)
            throw new ProjectManagementException("employee already have membership in project");

        projectMemberDao.addMember(project, employee);
        projectDao.refresh(project);
    }

    @Override
    @Transactional
    @Authenticate("hasRole(#project, 'MANAGER')")
    public void addDocumentToProject(@Param("project") Project project, String title, 
               String description, Document document) throws ProjectManagementException {

        String userHome = System.getProperty("user.home");
        File userHomeDir = new File(userHome);

        File projectManagementDir = new File(userHomeDir, PROJECT_MANAGEMENT_ROOT_DIR_NAME);
        File fileStoreDir = new File(projectManagementDir, FILE_STORE_DIR_NAME);
        if(!fileStoreDir.exists())
            fileStoreDir.mkdirs();

        documentDao.persist(document);

        try {
            FileOutputStream fos = new FileOutputStream(new File(fileStoreDir, document.getId().toString() + ".dat"));
            byte[] buffer = new byte[4096];
            int count = 0;
            while((count = document.getInputStream().read(buffer)) != -1){
                fos.write(buffer, 0, count);
            }
            document.setInternalFileName(document.getId().toString() + ",dat");
        } catch (IOException ex) {
            log.error("Failed to store file", ex);
            throw new ProjectManagementException("Failed to store file", ex);
        }
        
        ProjectDocument pd = new ProjectDocument();
        pd.setProject(project);
        pd.setTitle(title);
        pd.setDescription(description);
        pd.setDocument(document);
        projectDocumentDao.persist(pd);
    }

}
