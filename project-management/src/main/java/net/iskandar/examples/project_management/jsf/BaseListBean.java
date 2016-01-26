/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.project_management.jsf;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedProperty;
import net.iskandar.examples.project_management.dao.EmployeeDao;
import net.iskandar.examples.project_management.dao.ListLoadParams;
import net.iskandar.examples.project_management.dao.ListLoader;
import net.iskandar.examples.project_management.dao.PagingParams;
import net.iskandar.examples.project_management.domain.BaseEntity;
import net.iskandar.examples.project_management.domain.Employee;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortMeta;
import org.primefaces.model.SortOrder;

/**
 *
 * @author iskandar
 */
public abstract class BaseListBean<T extends BaseEntity> {
 
    private static final Logger log = LogManager.getLogger(BaseListBean.class);
    private LazyListDataModel lazyModel;
    private T selectedItem;

    public T getSelectedEmployee() {
        return selectedItem;
    }

    public void setSelectedEmployee(T selectedItem) {
        this.selectedItem = selectedItem;
    }

    @PostConstruct
    public void init() {
        lazyModel = new LazyListDataModel();
        if (lazyModel instanceof LazyDataModel) {
            log.debug("lazyModel is OK");
        }
    }

    public LazyListDataModel getLazyModel() {
        log.debug("getLazyModel");
        return lazyModel;
    }
    
    protected abstract ListLoader<T> getLoader();

    private class LazyListDataModel extends LazyDataModel<T> {

        private List<T> items;

        @Override
        public Object getRowKey(T object) {
            return object.getId().toString();
        }

        @Override
        public T getRowData(String rowKey) {
            log.debug("getRowData");
            return getLoader().getRowData(rowKey);
        }
        
        @Override
        public List<T> load(int first, int pageSize,
                String sortField, SortOrder sortOrder,
                Map<String, Object> filters) {
            log.debug("load1");
            log.debug("sortField=" + sortField);
            log.debug("sortOrder=" + sortOrder.name());

            if (items == null) {
                ListLoadParams params = new ListLoadParams();
                params.setSortField(sortField);
                if(sortOrder == SortOrder.ASCENDING)
                    params.setSortOrder(ListLoadParams.SortOrder.ASCENDING);
                else
                    params.setSortOrder(ListLoadParams.SortOrder.DESCENDING);
                params.setPagingParams(new PagingParams(first, pageSize));
                setRowCount(getLoader().count());
                items = getLoader().load(params);
            }
            return items;
        }

/*        @Override
        public List<Employee> load(int first, int pageSize, List<SortMeta> multiSortMeta, Map<String, Object> filters) {
            log.debug("load2");
            return new ArrayList<Employee>();
        }*/

    }
    
    
    
}
