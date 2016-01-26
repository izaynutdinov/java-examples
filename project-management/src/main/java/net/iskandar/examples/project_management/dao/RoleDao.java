package net.iskandar.examples.project_management.dao;

import java.util.List;
import net.iskandar.examples.project_management.domain.Role;

public interface RoleDao extends Dao<Role> {
    List<Role> list();
}
