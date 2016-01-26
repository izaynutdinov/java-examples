package net.iskandar.examples.project_management.service;

import net.iskandar.examples.project_management.ProjectManagementException;
import net.iskandar.examples.project_management.domain.Document;
import net.iskandar.examples.project_management.domain.Employee;
import net.iskandar.examples.project_management.domain.Project;
import net.iskandar.examples.project_management.domain.Task;

public interface ProjectManagementService {

    public String PROJECT_MANAGEMENT_ROOT_DIR_NAME = "ProjectManagement";
    public String FILE_STORE_DIR_NAME = "fileStore";
    public String LUCENE_INDEX_BASE_DIR_NAME = "indexBase";

    Integer createEmployee(Employee employee) throws ProjectManagementException;
    void updateEmployee(Employee employee) throws ProjectManagementException;

    Integer createProject(Project project) throws ProjectManagementException;
    void updateProject(Project project) throws ProjectManagementException;
    void addMemberToProject(Project project, Integer employeeId) throws ProjectManagementException;
    void addDocumentToProject(Project project, String title, 
                  String description, Document document) throws ProjectManagementException;
    
    
    Integer createTask(Task task) throws ProjectManagementException;
    void updateTask(Task task) throws ProjectManagementException;

    boolean loginExist(String login, Integer employeeId);
    boolean emailExist(String email, Integer employeeId);

}
