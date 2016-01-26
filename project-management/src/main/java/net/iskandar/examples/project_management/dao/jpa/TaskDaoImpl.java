/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.project_management.dao.jpa;

import java.util.List;
import javax.persistence.Query;
import net.iskandar.examples.project_management.dao.ListLoadParams;
import net.iskandar.examples.project_management.dao.TaskDao;
import net.iskandar.examples.project_management.domain.Task;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

/**
 *
 * @author iskandar
 */

@Repository(value = "taskDao")
@Scope("singleton")
public class TaskDaoImpl extends BaseDaoImpl<Task> implements TaskDao {

    private static final Logger log = LogManager.getLogger(TaskDaoImpl.class);

    public TaskDaoImpl() {
        super(Task.class);
    }

    public int count() {
        Query q = createQuery("select count(t) from Task t");
        return ((Long) q.getSingleResult()).intValue();
    }

    @Override
    public List<Task> load(ListLoadParams params) {
        log.debug("load { firstResult=" + params.getPagingParams().getFirstResult() 
                    + ", maxResults" + params.getPagingParams().getMaxResults() + " }");
        return getList(params);
    }

    @Override
    public Task getRowData(String rowKey) {
        Integer id = Integer.parseInt(rowKey);
        return get(id);
    }
    
}
