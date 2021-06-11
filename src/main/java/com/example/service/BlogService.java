package com.example.service;

import com.example.entity.BlogBean;

import com.example.repository.BlogRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.transaction.Transactional;

@Service
public class BlogService {
    
	@Autowired
    private BlogRepository repository;

  //  SimpleDateFormat publicationDate = new SimpleDateFormat("yyyy-MM-dd");
    public BlogBean saveBlog(BlogBean bean) {
        return repository.save(bean);
    }

    public List<BlogBean> saveBlogs(List<BlogBean> beans) {
        
    
    	return repository.saveAll(beans);
    }
    
    public List<BlogBean> blogsByDate(Date publicationDate){
    	List<BlogBean> beans = repository.findAllByPublicationDate(publicationDate);
    	return beans;
    }
   
    public BlogBean getBlogByBlogId(int blogId) {
        return repository.findByBlogId(blogId);
    }

    public BlogBean getBlogByRating(double rating) {
        return repository.findByRating(rating);
    }
    @Transactional
    public String deleteBlog(int blogId) {
        repository.deleteByBlogId(blogId);
        return "blog removed !! " + blogId;
    }

    public BlogBean updateBlog(BlogBean bean) {
        BlogBean existingBlog = repository.findByBlogId(bean.getBlogId());
        existingBlog.setPost(bean.getPost());
    //    existingBlog.setComment(bean.getComment());
        existingBlog.setRating(bean.getRating());
        return repository.save(existingBlog);
    }
    @Transactional
	public List<BlogBean> findByRatingGreaterThan(double rating) {
		List<BlogBean> beans = repository.findByRatingGreaterThan(rating);
		return beans;
	}

	public List<BlogBean> getBlogs() {
        return repository.findAll();
    }
	
	
}
