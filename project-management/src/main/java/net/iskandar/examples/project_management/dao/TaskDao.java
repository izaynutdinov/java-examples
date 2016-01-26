package net.iskandar.examples.project_management.dao;

import java.util.List;
import net.iskandar.examples.project_management.domain.Employee;
import net.iskandar.examples.project_management.domain.Task;

public interface TaskDao extends Dao<Task>, ListLoader<Task> {

}
