package net.iskandar.examples.project_management.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.search.annotations.Indexed;


@Entity
@Table(name = "TASKS")
@Indexed
public class Task extends BaseEntity {

    @ManyToOne(optional = false)
    @JoinColumn(name = "PROJECT_ID", nullable = false, updatable = false)
    private Project project;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "ASSIGNEE_ID")
    private Employee assignee;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "DESCRIPTION", columnDefinition = "text")
    private String description;

    @Column(name = "START_DATE", columnDefinition = "date")
    private Date startDate;

    @Column(name = "END_DATE", columnDefinition = "date")
    private Date endDate;

    @Column(name = "MODIFIED")
    private Date modified;

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Employee getAssignee() {
        return assignee;
    }

    public void setAssignee(Employee assignee) {
        this.assignee = assignee;
    }
    
    public String getTitleShort(){
        return shortify(getTitle());
    }
    

}
