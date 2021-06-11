package com .example.controller;

import com.example.entity.BlogBean;

import com.example.service.BlogService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BlogController {

    @Autowired
    private BlogService service;

    @PostMapping("/addBlog")
    public BlogBean addBlog(@RequestBody BlogBean bean) {
        return service.saveBlog(bean);
    }

    @GetMapping("/beans/{rating}")
    @ResponseBody
    public List<BlogBean> findByRatingGreaterThan(@PathVariable double rating) {
        List<BlogBean> beans = (List<BlogBean>) service.findByRatingGreaterThan(rating);
    	return beans;
    }
 
     @GetMapping("/beans")
    public List<BlogBean> findAllBlogs() {
        return service.getBlogs();
    }

    @GetMapping("/blogByBlogId/{blogId}")
    public BlogBean findBlogByBlogId(@PathVariable int blogId) {
        return service.getBlogByBlogId(blogId);
    }

    @GetMapping("/bean/{rating}")
    public BlogBean findBlogByRating(@PathVariable double rating) {
        return service.getBlogByRating(rating);
    }

    @PutMapping("/update")
    public BlogBean updateBlog(@RequestBody BlogBean bean) {
        return service.updateBlog(bean);
    }

    @DeleteMapping("/delete/{blogId}")
    public String deleteBlog(@PathVariable int blogId) {
        return service.deleteBlog(blogId);
    }
}