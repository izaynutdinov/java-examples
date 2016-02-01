/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.project_management.jsf.breadcrumb;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import net.iskandar.examples.shared.breadcrumb.EvaluationContext;

/**
 *
 * @author iskandar
 */
public abstract class BaseProjectItem extends BaseItem {

    private Integer projectId;

    public BaseProjectItem(String viewName) {
        super(viewName);
    }

    public BaseProjectItem(String viewName, Integer projectId) {
        super(viewName);
        this.projectId = projectId;
    }

    protected Integer getProjectId() {
        return projectId;
    }

    @Override
    public void load(DataInputStream dis) throws IOException {
        projectId = dis.readInt();
    }

    @Override
    public void save(DataOutputStream dos) throws IOException {
        super.save(dos);
        dos.writeInt(projectId);
    }

    @Override
    public void applyToContext() {
        getAdapter().setProjectId(projectId);
    }
    
}
