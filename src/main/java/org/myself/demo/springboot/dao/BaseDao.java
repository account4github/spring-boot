package org.myself.demo.springboot.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T, ID extends Serializable> {

	public int save(T t);
	
	public T findById(ID id);
	
	public List<T> findAll();
	
	public int udpate(T t);
	
	public int delete(T t);
	
	public int deleteById(ID id);

}