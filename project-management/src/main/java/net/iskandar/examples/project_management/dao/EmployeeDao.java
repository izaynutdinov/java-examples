package net.iskandar.examples.project_management.dao;

import java.util.List;
import net.iskandar.examples.project_management.domain.Employee;
import net.iskandar.examples.project_management.domain.Project;

public interface EmployeeDao extends Dao<Employee>, ListLoader<Employee> {
    
    Employee getByLogin(String login);
    Employee getByEmail(String email);
    List<Employee> getSortedByName();
    List<Employee> getNotMembers(Project project);
    List<Employee> list();

}
