package com.urchin.blog.service.impl;

import com.urchin.blog.dao.AddBlogDAO;
import com.urchin.blog.entity.Blog;
import com.urchin.blog.service.AddBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author urchin
 * @Description
 * @PROJECT_NAME urchin_blog_service
 * @create 2020-06-03 1:03
 */
@Service
public class AddBlogServiceImpl implements AddBlogService {
    @Autowired
    AddBlogDAO blogDAO;
    @Override
    public Integer addBlog(Blog addBlog) {
        return blogDAO.addBlogs(addBlog);
    }
}