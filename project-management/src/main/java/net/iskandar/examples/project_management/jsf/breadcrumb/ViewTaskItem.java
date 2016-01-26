/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.project_management.jsf.breadcrumb;

import net.iskandar.examples.project_management.domain.Task;

/**
 *
 * @author iskandar
 */
public class ViewTaskItem extends BaseTaskItem {

    public ViewTaskItem() {
        super("viewTask");
    }

    public ViewTaskItem(Integer taskId) {
        super(taskId, "viewTask");
    }

    @Override
    protected String createLabel() {
        Task task = getAdapter().getTask(getTaskId());
        return "View Task [" + task.getTitleShort() + "]";
    }
    
}
