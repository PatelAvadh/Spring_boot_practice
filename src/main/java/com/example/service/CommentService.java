package com.example.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.BlogBean;
import com.example.entity.CommentBean;
import com.example.repository.CommentRepository;

@Service
public class CommentService {
	@Autowired
	private CommentRepository commentRepository;
	
	@Autowired(required = true)
	private BlogBean bean;
	
	@Transactional
	public CommentBean getAllCommentsByBlogId(int blogId) {
		
		return commentRepository.findByBlogId(bean.getBlogId());
	}
}
