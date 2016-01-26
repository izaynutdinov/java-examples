package net.iskandar.examples.project_management.dao.jpa;

import java.util.List;
import javax.persistence.TypedQuery;
import net.iskandar.examples.project_management.dao.RoleDao;
import net.iskandar.examples.project_management.domain.Role;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository("roleDao")
@Scope("singleton")
public class RoleDaoImpl extends BaseDaoImpl<Role> implements RoleDao {

    public RoleDaoImpl() {
        super(Role.class);
    }

    @Override
    public List<Role> list() {
        TypedQuery<Role> q = createTypedQuery("select r from Role r order by id");
        return q.getResultList();
    }

}
