package com.example.repository;

import com.example.entity.BlogBean;
import com.example.entity.CommentBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


public interface CommentRepository extends JpaRepository<CommentBean, Integer> {

	public CommentBean findByBlogId(Integer blogId);

	
}