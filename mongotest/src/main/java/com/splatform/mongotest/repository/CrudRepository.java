package com.splatform.mongotest.repository;

import java.io.Serializable;

import org.springframework.data.repository.Repository;

/**
 * <p>
 * descrption:
 * </p>
 * 
 * @author fuzl
 * @date 2015年4月17日
 */
public interface CrudRepository<T, ID extends Serializable> extends
		Repository<T, ID> {

	<S extends T> S save(S entity);

	T findOne(ID primaryKey);

	Iterable<T> findAll();

	Long count();

	void delete(T entity);

	boolean exists(ID primaryKey);

	// … more functionality omitted.
}
