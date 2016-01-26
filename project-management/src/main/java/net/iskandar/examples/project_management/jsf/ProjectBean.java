/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.project_management.jsf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;
import javax.servlet.http.Part;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import net.iskandar.examples.project_management.dao.EmployeeDao;
import net.iskandar.examples.project_management.dao.ProjectDao;
import net.iskandar.examples.project_management.dao.ProjectDocumentDao;
import net.iskandar.examples.project_management.domain.Document;
import net.iskandar.examples.project_management.domain.Employee;
import net.iskandar.examples.project_management.domain.Project;
import net.iskandar.examples.project_management.domain.ProjectDocument;
import net.iskandar.examples.project_management.domain.ProjectMember;
import net.iskandar.examples.project_management.jsf.breadcrumb.ViewProjectItem;
import net.iskandar.examples.project_management.service.ProjectManagementService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author iskandar
 */
@ManagedBean(name = "projectBean")
@RequestScoped
public class ProjectBean {

    private static final Logger log = LogManager.getLogger(ProjectBean.class);

    @ManagedProperty(value = "#{projectDao}")
    private ProjectDao projectDao;

    @ManagedProperty("#{projectManagementService}")
    private ProjectManagementService service;

    @ManagedProperty("#{employeeDao}")
    private EmployeeDao employeeDao;

    @ManagedProperty("#{projectDocumentDao}")
    private ProjectDocumentDao projectDocumentDao;

    @ManagedProperty("#{breadCrumbBean}")
    private BreadCrumbBean breadCrumbBean;

    private List<Employee> managers;

    private Integer projectId;
    private Project project;

    @Size(min = 3, max = 255, message = "Enter the value btween 3 and 255 characters")
    private String title;
    private String description;
    private Date startDate;
    private Date endDate;

    private Integer managerId;

    private Integer employeeId;

    private List<Employee> employeesNotMembers;

    private List<ProjectMember> membersSortedByName;

    private List<ProjectDocument> documents;

    private String pdTitle;
    private String pdDescription;
    private Part uploadedFile;

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

    public ProjectDocumentDao getProjectDocumentDao() {
        return projectDocumentDao;
    }

    public void setProjectDocumentDao(ProjectDocumentDao projectDocumentDao) {
        this.projectDocumentDao = projectDocumentDao;
    }

    public BreadCrumbBean getBreadCrumbBean() {
        return breadCrumbBean;
    }

    public void setBreadCrumbBean(BreadCrumbBean breadCrumbBean) {
        this.breadCrumbBean = breadCrumbBean;
    }

    public ProjectManagementService getService() {
        return service;
    }

    public void setService(ProjectManagementService service) {
        this.service = service;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Project getProject() {
        if (project == null) {
            if (projectId != null) {
                project = projectDao.get(projectId);
            }
        }
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public String getTitle() {
        if (title == null && projectId != null) {
            title = getProject().getTitle();
        }
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        if (description == null && projectId != null) {
            description = getProject().getDescription();
        }
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        if (startDate == null && projectId != null) {
            startDate = getProject().getStartDate();
        }
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        if (endDate == null && projectId != null) {
            endDate = getProject().getEndDate();
        }
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getManagerId() {
        if (managerId == null && projectId != null) {
            managerId = getProject().getManager().getId();
        }
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public List<ProjectDocument> getDocuments() {
        if (documents == null) {
            documents = projectDocumentDao.getDocuments(getProject());
        }
        return documents;
    }

    public void setDocuments(List<ProjectDocument> documents) {
        this.documents = documents;
    }

    public String getPdTitle() {
        return pdTitle;
    }

    public void setPdTitle(String pdTitle) {
        this.pdTitle = pdTitle;
    }

    public String getPdDescription() {
        return pdDescription;
    }

    public void setPdDescription(String pdDescription) {
        this.pdDescription = pdDescription;
    }

    public Part getUploadedFile() {
        return uploadedFile;
    }

    public void setUploadedFile(Part uploadedFile) {
        this.uploadedFile = uploadedFile;
    }

    public List<Employee> getManagers() {
        if (managers == null) {
            managers = employeeDao.getSortedByName();
        }
        return managers;
    }

    private Project setProjectValues() {
        Project project = new Project();
        project.setTitle(getTitle());
        project.setDescription(getDescription());
        project.setManager(employeeDao.get(getManagerId()));
        project.setStartDate(startDate);
        project.setEndDate(endDate);
        return project;
    }

    public String createProject() {
        Project project = setProjectValues();
        setProjectId(service.createProject(project));
        return breadCrumbBean.replaceCurrent(new ViewProjectItem(projectId));
    }

    public String updateProject() {
        log.debug("updateProject breadCrumbBean.identityHashCode=" + System.identityHashCode(breadCrumbBean));

        Project project = setProjectValues();
        project.setId(getProjectId());
        log.debug("manager=" + project.getManager().getFullName());
        service.updateProject(project);
        log.debug("breadCrumbBean.items.size()=" + breadCrumbBean.getItems().size());
        return breadCrumbBean.navigateBack();
    }

    public List<Employee> getEmployeesNotMembers() {
        if (employeesNotMembers == null) {
            employeesNotMembers = employeeDao.getNotMembers(getProject());
        }
        return employeesNotMembers;
    }

    public void addMember(ActionEvent event) {
        service.addMemberToProject(getProject(), employeeId);
        employeesNotMembers = null;
        membersSortedByName = null;
        project = null;
        employeeId = null;
    }

    public String addProjectDocument() {
        try {
            log.debug("addProjectDocument");
            log.debug("pdTitle=" + pdTitle);
            log.debug("pdDescription=" + pdDescription);
            Document document = new Document();
            log.debug(uploadedFile);
            document.setContentType(uploadedFile.getContentType());
            document.setOriginalFileName(uploadedFile.getSubmittedFileName());
            document.setInputStream(uploadedFile.getInputStream());
            service.addDocumentToProject(getProject(), pdTitle, pdDescription, document);
            pdTitle = null;
            pdDescription = null;
            uploadedFile = null;
            documents = null;
            return breadCrumbBean.refresh();
        } catch (IOException ex) {
            log.error("error adding document", ex);
            throw new RuntimeException("error adding document");
        }
    }

    public String getProjectTitleShort() {
        if (projectId == null) {
            return "";
        }
        String title = getProject().getTitle();
        if (title.length() > 30) {
            title = title.substring(0, 29);
            title += "...";
        }
        return title;
    }

}
