/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.shared.jsf.breadcrumb;

import net.iskandar.examples.project_management.domain.Employee;
import net.iskandar.examples.project_management.domain.Project;

/**
 *
 * @author iskandar
 */

public interface EvaluationContext {
    Object getObject(String name);
}
