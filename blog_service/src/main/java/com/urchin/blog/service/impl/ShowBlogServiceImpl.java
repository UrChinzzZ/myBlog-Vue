package com.urchin.blog.service.impl;

import com.urchin.blog.dao.ShowBlogDAO;
import com.urchin.blog.entity.Blog;
import com.urchin.blog.service.ShowBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * @author urchin
 * @Description 查询博客
 * @PROJECT_NAME urchin_blog_service
 * @create 2020-06-05 23:25
 */
@Service
public class ShowBlogServiceImpl implements ShowBlogService {
    @Autowired
    ShowBlogDAO showBlogDao;
    @Override
    public List<Blog> showBlogs() {
        return showBlogDao.showBlogs();
    }

    @Override
    public List<Blog> showBlog(Integer id) {
        return showBlogDao.showBlog(id);
    }
}