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
public class EditTaskItem extends BaseTaskItem {

    public EditTaskItem() {
        super("editTask");
    }

    public EditTaskItem(Integer taskId) {
        super(taskId, "editTask");
    }

    @Override
    protected String createLabel() {
        Task task = getAdapter().getTask(getTaskId());
        return "Edit Task [" + task.getTitleShort() + "]";
    }

}
