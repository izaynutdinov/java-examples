package net.iskandar.examples.project_management.dao.jpa;

import java.util.List;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import net.iskandar.examples.project_management.dao.EmployeeDao;
import net.iskandar.examples.project_management.dao.ListLoadParams;
import net.iskandar.examples.project_management.domain.Employee;
import net.iskandar.examples.project_management.domain.Project;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository(value = "employeeDao")
@Scope("singleton")
public class EmployeeDaoImpl extends BaseDaoImpl<Employee> implements EmployeeDao {

    private static final Logger log = LogManager.getLogger(EmployeeDaoImpl.class);

    public EmployeeDaoImpl() {
        super(Employee.class);
    }

    @Override
    public List<Employee> load(ListLoadParams params) {
        log.debug("load { firstResult=" + params.getPagingParams().getFirstResult() 
                    + ", maxResults" + params.getPagingParams().getMaxResults() + " }");
        return getList(params);
    }

    @Override
    public int count() {
        Query q = createQuery("select count(e) from Employee e");
        return ((Long) q.getSingleResult()).intValue();
    }

    @Override
    public Employee getRowData(String rowKey) {
        Integer id = Integer.parseInt(rowKey);
        return get(id);
    }

    @Override
    public Employee getByLogin(String login) {
        TypedQuery<Employee> query = createTypedQuery("select e from Employee e where e.login=:login");
        query.setParameter("login", login);
        return getFirstResult(query);
    }

    @Override
    public Employee getByEmail(String email) {
        TypedQuery<Employee> query = createTypedQuery("select e from Employee e where e.email=:email");
        query.setParameter("email", email);
        return getFirstResult(query);
    }

    @Override
    public List<Employee> getSortedByName() {
        TypedQuery<Employee> q = createTypedQuery("select e from Employee e order by e.firstName, e.lastName");
        return q.getResultList();
    }

    @Override
    public List<Employee> getNotMembers(Project project) {
        TypedQuery<Employee> q = createTypedQuery("select e from Employee e where not :project member of e.projects");
        q.setParameter("project", project);
        return q.getResultList();
    }

    @Override
    public List<Employee> list() {
        TypedQuery<Employee> q = createTypedQuery("select e from Employee e");
        return q.getResultList();
    }

}
