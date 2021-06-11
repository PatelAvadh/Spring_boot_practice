package com.example.controller;

import com.example.entity.BlogBean;
//import com.example.jpa.exception.ResourceNotFoundException;
import com.example.entity.CommentBean;
import com.example.repository.CommentRepository;
import com.example.service.CommentService;
import com.example.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class CommentController {

    @Autowired
    private CommentService commentService;
    
    @Autowired
    private BlogBean bean;
    

    @GetMapping("/beans/{blogId}/comments")
    public CommentBean getAllCommentsByBlogId(@PathVariable (value = "blogId") int blogId) {
        return commentService.getAllCommentsByBlogId(bean.getBlogId());
    }

}