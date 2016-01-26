/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.project_management.jsf.breadcrumb;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 *
 * @author iskandar
 */
public abstract class BaseTaskItem extends BaseItem {

    private Integer taskId;

    public BaseTaskItem(String viewName) {
        super(viewName);
    }
    
    public BaseTaskItem(Integer taskId, String viewName) {
        super(viewName);
        this.taskId = taskId;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }
    

    @Override
    public void load(DataInputStream dis) throws IOException {
        taskId = dis.readInt();
    }

    @Override
    public void applyToContext() {
        getAdapter().setTaskId(taskId);
    }

    @Override
    public void save(DataOutputStream dos) throws IOException {
        super.save(dos);
        dos.writeInt(taskId);
    }
    
    
}
