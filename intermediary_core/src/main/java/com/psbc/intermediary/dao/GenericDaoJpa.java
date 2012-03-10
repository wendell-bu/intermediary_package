package com.psbc.intermediary.dao;

import com.psbc.intermediary.domain.DomainObject;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: savile
 * Date: 12-3-7
 * Time: 上午11:58
 * To change this template use File | Settings | File Templates.
 */
public class GenericDaoJpa<T extends DomainObject> implements GenericDao<T> {
    private Class<T> type;
    protected EntityManager entityManager;

    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public GenericDaoJpa(Class<T> type) {
        super();
        this.type = type;
    }

    @Transactional(readOnly = true)
    public T get(Long id) {
        if (id == null) {
            return null;
        } else {
            return entityManager.find(type, id);
        }
    }

    @Transactional(readOnly = true)
    public List<T> getAll() {
        return entityManager.createQuery(
                "select o from " + type.getName() + "o"
        ).getResultList();
    }

    public void save(T object) {
        entityManager.persist(object);
    }

    public void delete(T object) {
        entityManager.remove(object);
    }
}
