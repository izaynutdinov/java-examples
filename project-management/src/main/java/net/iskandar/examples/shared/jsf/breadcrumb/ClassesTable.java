/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.shared.jsf.breadcrumb;

import java.util.HashMap;

/**
 * Class table used for BreadCrumb persistence
 * Item has static classTable. Use register class to add classes to persistence table.
 * @author iskandar
 */
public class ClassesTable {

    private HashMap<Integer, Class<? extends Item>> classById = new HashMap<>();
    private HashMap<String, Integer> idByClassName = new HashMap<>();
    private int lastClassId = 0;

    public synchronized void registerClass(Class<? extends Item> clazz){
        int newClassId = ++lastClassId;
        classById.put(newClassId, clazz);
        idByClassName.put(clazz.getName(), newClassId);
    }

    public synchronized Integer getIdByClass(Class<? extends Item> clazz){
        return idByClassName.get(clazz.getName());
    }

    public synchronized Class<? extends Item> getClassById(int id){
        return classById.get(id);
    }

    boolean isRegistered(Class<? extends Item> clazz) {
        return idByClassName.containsKey(clazz.getName());
    }

}
