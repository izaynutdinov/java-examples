/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.project_management.dao.jpa;

import javax.persistence.TypedQuery;
import net.iskandar.examples.project_management.dao.ProjectMemberDao;
import net.iskandar.examples.project_management.domain.Employee;
import net.iskandar.examples.project_management.domain.Project;
import net.iskandar.examples.project_management.domain.ProjectMember;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

/**
 *
 * @author iskandar
 */
@Repository(value = "projectMemberDao")
@Scope(value = "singleton")
public class ProjectMemberDaoImpl extends BaseDaoImpl<ProjectMember> implements ProjectMemberDao {

    public ProjectMemberDaoImpl() {
        super(ProjectMember.class);
    }

    @Override
    public ProjectMember addMember(Project project, Employee employee) {
        ProjectMember projectMember = new ProjectMember();
        projectMember.setEmployee(employee);
        projectMember.setProject(project);
        persist(projectMember);
        return projectMember;
    }

    @Override
    public ProjectMember findMember(Project project, Employee employee) {
        TypedQuery<ProjectMember> q = createTypedQuery("select pm from ProjectMember pm where pm.employee=:employee and pm.project=:project");
        q.setParameter("project", project);
        q.setParameter("employee", employee);
        return getFirstResult(q);
    }
    
}
