/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.project_management.jsf.breadcrumb;

import net.iskandar.examples.project_management.domain.Project;
import net.iskandar.examples.project_management.jsf.breadcrumb.BaseProjectItem;
import net.iskandar.examples.shared.breadcrumb.EvaluationContext;

/**
 *
 * @author iskandar
 */
public class ViewProjectItem extends BaseProjectItem {

    public ViewProjectItem() {
        super("viewProject");
    }

    public ViewProjectItem(Integer projectId) {
        super("viewProject", projectId);
    }

    @Override
    protected String createLabel() {
        Project project = getAdapter().getProject(getProjectId());
        return "View Project [" + project.getShortTitle() + "]";
    }
    
}
