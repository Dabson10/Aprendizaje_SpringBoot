package com.github.Dabson10.Autowired.controller;
import com.github.Dabson10.Autowired.Entity.Posteo;
import com.github.Dabson10.Autowired.repository.PosteoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApplicationController {

    @Autowired
    PosteoRepository post;

    @GetMapping("/posteos")
    public List<Posteo> traerTodos(){
        return post.traerTodos();
    }
}
