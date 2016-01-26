/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.project_management.dao.jpa;

import java.util.List;
import javax.persistence.TypedQuery;
import net.iskandar.examples.project_management.dao.ProjectDocumentDao;
import net.iskandar.examples.project_management.domain.Project;
import net.iskandar.examples.project_management.domain.ProjectDocument;
import org.springframework.stereotype.Repository;

/**
 *
 * @author iskandar
 */
@Repository(value = "projectDocumentDao")
public class ProjectDocumentDaoImpl extends BaseDaoImpl<ProjectDocument> implements ProjectDocumentDao {

    public ProjectDocumentDaoImpl() {
        super(ProjectDocument.class);
    }

    @Override
    public List<ProjectDocument> getDocuments(Project project) {
        TypedQuery<ProjectDocument> q = createTypedQuery("select pd from ProjectDocument pd where pd.project=:project order by pd.id");
        q.setParameter("project", project);
        return q.getResultList();
    }
    
}
