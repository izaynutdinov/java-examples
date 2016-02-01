/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.shared.breadcrumb;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;

import org.apache.commons.codec.binary.Base64;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author iskandar
 */
public class BreadCrumb {

    private static final Logger log = LogManager.getLogger(BreadCrumb.class);

    private EvaluationContext context;
    private LinkedList<Item> items = new LinkedList<Item>();
    private Item currentItem;
    private byte[] stateBuf;
    private String state;

    private void clearState(){
        log.debug("clearState");
        stateBuf = null;
        state = null;
    }

    protected void clear(){
        log.debug("clear");
        clearState();
        items = new LinkedList<>();
    }

    public BreadCrumb() {
        this(new FacesContextEvaluationContext());
    }

    public BreadCrumb(EvaluationContext context) {
        this.context = context;
    }

    public EvaluationContext getContext() {
        return context;
    }

    public void addItem(Item item) {
        log.debug("addItem");
        item.setContext(context);
        items.add(item);
        currentItem = item;
        clearState();
    }

    public void removeLast(){
        log.debug("removeLast");
        items.removeLast();
        clearState();
        currentItem = items.getLast();
    }

    protected String addItemNavigate(Item item){
        log.debug("addItemNavigate");
        addItem(item);
        item.applyToContext();
        return item.navigate();
    }

    public List<Item> getItems(){
        return items;
    }

    public byte[] saveState(Item toItem) throws IOException {
        if(toItem != null) {
            boolean found = false;
            for(Item item : getItems()){
                if(item == toItem)
                    found = true;
            }
            if(!found)
                throw new BreadCrumbException("Item not found!");
        }

        if (stateBuf == null) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            try {
                DataOutputStream dos = new DataOutputStream(baos);
                try {
                    dos.writeShort(items.size());
                    for (Item item : items) {
                        item.save(dos);
                        if(toItem == item)
                            break;
                    }
                } finally {
                    dos.close();
                }
                stateBuf = baos.toByteArray();
            } finally {
                baos.close();
            }
        }
        return stateBuf;
    }

    public String getState() {
        if(state == null){
            try {
                state = Base64.encodeBase64URLSafeString(saveState((Item) null));
            } catch (IOException ex) {
                throw new BreadCrumbException("Error getting state of breadcrumb", ex);
            }
        }
        return state;
    }

    public byte[] getStateBinary(){
        try {
            return saveState((Item) null);
        } catch (IOException ex) {
            throw new BreadCrumbException("Error getting state of breadcrumb", ex);
        }
    }

    public void setStateBinary(byte[] state){
        loadState(state);
    }

    public void loadState(byte[] state) {
        log.debug("loadState size=" + state.length);
        log.debug("identityHashCode=" + System.identityHashCode(this));
        clear();
        try {
            ByteArrayInputStream bais = new ByteArrayInputStream(state);
            try {
                DataInputStream dis = new DataInputStream(bais);
                try {
                    short count = dis.readShort();
                    System.out.println("count=" + count);
                    for (int i = 0; i < count; i++) {
                        Item item = Item.create(dis);
                        item.load(dis);
                        addItem(item);
                    }
                    if(currentItem != null)
                        currentItem.applyToContext();
                } finally {
                    dis.close();
                }
            } finally {
                bais.close();
            }
            log.debug("size=" + getItems().size());
        } catch (IOException | IllegalAccessException | InstantiationException ex) {
            log.error("Error in loadState", ex);
            throw new BreadCrumbException("Error in loadState", ex);
        }
    }

    public void setState(String state) throws IOException, InstantiationException, IllegalAccessException {
        System.out.println("setState");
        byte[] stateArr = Base64.decodeBase64(state);
        loadState(stateArr);
    }

    public String navigate(Item item){
        currentItem = item;
        while(true){
            if(items.getLast() != item){
                items.removeLast();
            } else {
                break;
            }
        }
        clearState();
        item.applyToContext();
        return item.navigate();
    }
    
    public String replaceCurrent(Item item){
        removeLast();
        addItem(item);
        return currentItem.navigate();
    }

    public String navigateBack(){
        log.debug("navigateBack size=" + items.size());
        items.removeLast();
        clearState();
        currentItem = items.getLast();
        return currentItem.navigate();
    }
    
    public String refresh(){
        return currentItem.navigate();
    }

    public String getStateWithAddon(Item addon) {
        BreadCrumb breadCrumb = new BreadCrumb();
        for(Item item : getItems())
            breadCrumb.addItem(item);
        breadCrumb.addItem(addon);
        return breadCrumb.getState();
    }

    public String getStateSlice(Item item) throws IOException{
        return Base64.encodeBase64URLSafeString(saveState(item));
    }

    public BreadCrumb createSingleton(Item item){
        BreadCrumb breadCrumb = new BreadCrumb(getContext());
        breadCrumb.addItem(item);
        return breadCrumb;
    }
    
    public Item getFirst(){
        return items.getFirst();
    }

}
