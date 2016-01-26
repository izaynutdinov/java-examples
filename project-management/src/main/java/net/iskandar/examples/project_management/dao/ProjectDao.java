package net.iskandar.examples.project_management.dao;

import java.util.List;
import net.iskandar.examples.project_management.domain.Project;

public interface ProjectDao extends Dao<Project>, ListLoader<Project> {
    List<Project> list();
}
