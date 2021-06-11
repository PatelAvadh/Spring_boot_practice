package com.example.repository;

import com.example.entity.BlogBean;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<BlogBean,Integer> {
    public BlogBean findByRating(double rating);
    public BlogBean findByBlogId(int blogId);
    public void deleteByBlogId(int blogId);
	public List<BlogBean> findByRatingGreaterThan(double rating);
//	public List<BlogBean> findAllBlogs(List<BlogBean> beans);
	List<BlogBean> findAllByPublicationDate(Date publicationDate);
}

