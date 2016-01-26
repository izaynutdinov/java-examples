/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.project_management.dao;

import net.iskandar.examples.project_management.domain.Employee;
import net.iskandar.examples.project_management.domain.Project;
import net.iskandar.examples.project_management.domain.ProjectMember;

/**
 *
 * @author iskandar
 */
public interface ProjectMemberDao extends Dao<ProjectMember> {
    ProjectMember findMember(Project project, Employee employee);
    ProjectMember addMember(Project project, Employee employee);    
}
