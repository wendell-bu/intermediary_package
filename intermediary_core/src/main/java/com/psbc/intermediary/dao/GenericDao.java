package com.psbc.intermediary.dao;

import com.psbc.intermediary.domain.DomainObject;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: savile
 * Date: 12-3-7
 * Time: 上午11:47
 * To change this template use File | Settings | File Templates.
 */
public interface GenericDao<T extends DomainObject> {
    public T get(Long id);
    public List<T> getAll();
    public void save(T object);
    public void delete(T object);
}
