/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.shared.breadcrumb;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 *
 * @author iskandar
 */
public abstract class Item {

    private static final ClassesTable classesTable = new ClassesTable();

    private transient String label;
    private transient EvaluationContext context;
    private transient String viewName;

    public Item(String viewName) {
        this.viewName = viewName;
    }

    public String getViewName() {
        return viewName;
    }
    
    public abstract void applyToContext();

    public String getLabel(){
        if(label == null){
            label = createLabel();
        }
        return label;
    }
    
    private int getClassId(){
        return classesTable.getIdByClass(getClass());
    }

    protected abstract String createLabel();

    public String navigate(){
        return viewName;
    }

    public void setContext(EvaluationContext context) {
        this.context = context;
    }
    
    protected EvaluationContext getContext(){
        return context;
    }
    
    public void save(DataOutputStream dos) throws IOException{
        Integer classId = getClassId();
        if(classId == null)
            throw new BreadCrumbException("Failed obtain classId for item class " + getClass().getName() + ". Did you forget to register class in classTable?");
        dos.write(classId);
    }
    
    public abstract void load(DataInputStream dis) throws IOException;

    public static Item create(DataInputStream dis) throws IOException, InstantiationException, IllegalAccessException{
        byte classId = dis.readByte();
        Class<? extends Item> clazz = classesTable.getClassById(classId);
        if(clazz == null)
            throw new BreadCrumbException("Failed to find class in classTable. Did you forget to register class?");
        Item item = clazz.newInstance();
        return item;
    }
    
    public static void registerClass(Class<? extends Item> clazz){
        classesTable.registerClass(clazz);
    }
    
    public static boolean isRegistered(Class<? extends Item> clazz){
        return classesTable.isRegistered(clazz);
    }

}
