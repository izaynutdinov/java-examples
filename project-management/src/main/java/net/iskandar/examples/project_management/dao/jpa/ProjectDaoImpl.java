package net.iskandar.examples.project_management.dao.jpa;

import java.util.List;
import java.util.Map;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import net.iskandar.examples.project_management.dao.ListLoadParams;
import net.iskandar.examples.project_management.dao.ProjectDao;
import net.iskandar.examples.project_management.domain.Employee;
import net.iskandar.examples.project_management.domain.Project;
import net.iskandar.examples.project_management.domain.ProjectMember;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository(value = "projectDao")
@Scope("singleton")
public class ProjectDaoImpl extends BaseDaoImpl<Project> implements ProjectDao {

    private static final Logger log = LogManager.getLogger(ProjectDaoImpl.class);

    public ProjectDaoImpl() {
        super(Project.class);
    }

    @Override
    public int count() {
        Query q = createQuery("select count(p) from Project p");
        int count = ((Long) q.getSingleResult()).intValue();
        return count;
    }

    @Override
    public List<Project> load(ListLoadParams params) {
        log.debug("load { firstResult=" + params.getPagingParams().getFirstResult() 
                    + ", maxResults" + params.getPagingParams().getMaxResults() + " }");        
        return getList(params);
    }

    @Override
    public Project getRowData(String rowKey) {
        Integer id = Integer.parseInt(rowKey);
        return get(id);
    }

    @Override
    public List<Project> list() {
        TypedQuery<Project> q = createTypedQuery("select p from Project p order by p.title asc");
        return q.getResultList();
    }


}
