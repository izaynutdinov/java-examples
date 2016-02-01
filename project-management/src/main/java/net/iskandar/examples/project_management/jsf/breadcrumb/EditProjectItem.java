/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.project_management.jsf.breadcrumb;

import net.iskandar.examples.project_management.domain.Project;
import net.iskandar.examples.shared.breadcrumb.EvaluationContext;

/**
 *
 * @author iskandar
 */
public class EditProjectItem extends BaseProjectItem {

    public EditProjectItem() {
        super("editProject");
    }

    public EditProjectItem(Integer projectId) {
        super("editProject", projectId);
    }
    
    @Override
    protected String createLabel() {
        Project project = getAdapter().getProject(getProjectId());
        return "Edit Project [" + project.getShortTitle() + "]";
    }

}
