package net.iskandar.examples.project_management.dao;

import java.io.Serializable;

public interface Dao<T> {
	
	T get(Serializable key);
	void persist(T object);
        void merge(T object);
	void delete(T object);
        T refresh(T object);
	
}
