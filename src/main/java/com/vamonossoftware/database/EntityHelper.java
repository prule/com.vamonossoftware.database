package com.vamonossoftware.database;

import javax.persistence.EntityManager;

public class EntityHelper {

    private final EntityManager entityManager;

    public EntityHelper(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public <T extends AbstractEntity> T refresh(T entity) {
        entityManager.refresh(entity);
        return entity;
    }
}
