package net.iskandar.examples.project_management.dao.jpa;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import net.iskandar.examples.project_management.dao.Dao;
import net.iskandar.examples.project_management.dao.ListLoadParams;
import net.iskandar.examples.project_management.dao.PagingParams;
import net.iskandar.examples.project_management.domain.Employee;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BaseDaoImpl<T> implements Dao<T> {

    private static final Logger log = LogManager.getLogger(BaseDaoImpl.class);

    @PersistenceContext
    private EntityManager em;
    private Class<T> clazz;

    public EntityManager getEm() {
        return em;
    }

    protected TypedQuery<T> createTypedQuery(String jpql) {
        return em.createQuery(jpql, clazz);
    }

    protected TypedQuery<T> createTypedQuery(ListLoadParams params) {
        log.debug("createTypedQuery");
        log.debug("sortField=" + params.getSortField());
        log.debug("sortOrder=" + params.getSortOrder().name());
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<T> c = cb.createQuery(clazz);
        Root<T> root = c.from(clazz);
        c.select(root);
        if(params.getSortOrder() == ListLoadParams.SortOrder.ASCENDING)
            c.orderBy(cb.asc(root.get(params.getSortField())));
        else
            c.orderBy(cb.desc(root.get(params.getSortField())));
        return em.createQuery(c);
    }
    
    protected Query createQuery(String jpql) {
        return em.createQuery(jpql);
    }

    protected CriteriaQuery<T> createCriteria() {
        return em.getCriteriaBuilder().createQuery(clazz);
    }

    protected List<T> getList(TypedQuery<T> query, PagingParams pp) {
        query.setFirstResult(pp.getFirstResult());
        query.setMaxResults(pp.getMaxResults());
        return query.getResultList();
    }
    
    protected List<T> getList(ListLoadParams params){
        TypedQuery<T> q = createTypedQuery(params);
        List<T> lst = getList(q, params.getPagingParams());
        return lst;
    }

    protected EntityManager getEntityManager() {
        return em;
    }

    public BaseDaoImpl(Class<T> clazz) {
        super();
        this.clazz = clazz;
    }

    @Override
    public T get(Serializable key) {
        return em.find(clazz, key);
    }

    @Override
    public void persist(T object) {
        em.persist(object);
    }

    @Override
    public void delete(T object) {
        em.remove(object);
    }

    @Override
    public void merge(T object) {
        em.merge(object);
    }
    
    public T getFirstResult(TypedQuery<T> q){
        List<T> results = q.getResultList();
        if(!results.isEmpty())
            return results.get(0);
        return null;
    }
    
    @Override
    public T refresh(T object){
        em.refresh(object);
        return object;
    }

}
