package com.marcelo.Myblog.teste;

import com.marcelo.Myblog.util.JPAUtil;
import javax.persistence.EntityManager;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author marcelo
 */
public class ConexaoDBTest {
        private final EntityManager entityManager;

    public ConexaoDBTest() {
        entityManager = JPAUtil.newInstance().getEntityManager();
    }

    @Test
    public void hasValidConnection() {
        Assert.assertNotNull(entityManager);
        Assert.assertTrue(entityManager.isOpen());
    }
    
}
