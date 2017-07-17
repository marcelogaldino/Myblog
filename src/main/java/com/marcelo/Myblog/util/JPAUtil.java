package com.marcelo.Myblog.util;

import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author danilo
 */
public class JPAUtil implements Serializable {
    
    private static final String PU = "livrariaF";
    private static JPAUtil instance;
    private final EntityManagerFactory factory;
    private EntityManager entityManager;

    JPAUtil() {
        factory = Persistence.createEntityManagerFactory(PU);
    }

    public static synchronized JPAUtil newInstance() {
        if (instance == null) {
            instance = new JPAUtil();
        }
        return instance;
    }

    public EntityManager getEntityManager() {
        if (entityManager == null || !entityManager.isOpen()) {
            entityManager = factory.createEntityManager();
        }
        return entityManager;
    }
    
    
    
    
    
//    private static EntityManagerFactory entityManagerFactory = Persistence
//            .createEntityManagerFactory("livrariaF");
//    
//    public EntityManager getEntityManager() {
//        return entityManagerFactory.createEntityManager();
//    }
    
}
