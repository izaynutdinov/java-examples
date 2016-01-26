/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.project_management.dao;

import java.util.List;
import java.util.Map;

/**
 *
 * @author iskandar
 */
public interface ListLoader<T> {
    int count();
    List<T> load(ListLoadParams params);
    T getRowData(String rowKey);
}
