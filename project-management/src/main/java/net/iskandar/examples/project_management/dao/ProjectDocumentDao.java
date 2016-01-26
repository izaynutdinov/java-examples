/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.project_management.dao;

import java.util.List;
import net.iskandar.examples.project_management.domain.Project;
import net.iskandar.examples.project_management.domain.ProjectDocument;

/**
 *
 * @author iskandar
 */
public interface ProjectDocumentDao extends Dao<ProjectDocument> {
    List<ProjectDocument> getDocuments(Project project);
}
