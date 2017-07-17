package com.marcelo.Myblog.controller;

import com.marcelo.Myblog.DAO.AutorDAO;
import com.marcelo.Myblog.model.Autor;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author marcelo
 */

@Named("PostBean")
@RequestScoped
public class PostController extends AbstractController {
    
    private final Autor Post = new Autor();
    
    @Inject
    private AutorDAO AutorDAO;
    
    public String savePost() {
        AutorDAO.save(Post);
        return "";
    }

    public Autor getPost() {
        return Post;
    }

    public Autor setPost(Autor Post) {
        return Post;
    }
    
}
