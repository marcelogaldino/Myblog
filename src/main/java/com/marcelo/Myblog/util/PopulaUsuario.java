package com.marcelo.Myblog.util;

import com.marcelo.Myblog.model.Usuario;
import java.time.Instant;
import java.util.Date;
import javax.persistence.EntityManager;

/**
 *
 * @author danilo
 */
public class PopulaUsuario {
    
    public static void main(String[] args) {
        
        Usuario usuario = new Usuario();
        Usuario usuario2 = new Usuario();
        Usuario usuario3 = new Usuario();
        
        usuario.setCriadoEm(Date.from(Instant.MIN));
        usuario.setLogin("daniloh");
        usuario.setSenha("senha123");
        
        usuario2.setCriadoEm(Date.from(Instant.MIN));
        usuario2.setLogin("felipe");
        usuario2.setSenha("senha1234");
        
        usuario3.setCriadoEm(Date.from(Instant.MIN));
        usuario3.setLogin("rodrigo1");
        usuario3.setSenha("90123012aaa");
           
        
        EntityManager em = new JPAUtil().getEntityManager();
        
        em.getTransaction().begin();

        em.persist(usuario);
        em.persist(usuario2);
        em.persist(usuario3);
        

        em.getTransaction().commit();
        em.close();        
                
    }
    
    
}
