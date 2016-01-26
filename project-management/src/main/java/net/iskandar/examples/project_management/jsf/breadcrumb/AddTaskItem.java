/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.project_management.jsf.breadcrumb;

/**
 *
 * @author iskandar
 */
public class AddTaskItem extends BaseItem {

    public AddTaskItem() {
        super("addTask");
    }

    @Override
    protected String createLabel() {
        return "Add Task";
    }
    
}
