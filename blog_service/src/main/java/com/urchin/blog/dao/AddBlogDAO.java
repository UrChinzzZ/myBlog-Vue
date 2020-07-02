package com.urchin.blog.dao;

import com.urchin.blog.entity.Blog;
import org.apache.ibatis.annotations.Param;

/**
 * @author urchin
 * @Description 添加博客
 * @PROJECT_NAME urchin_blog_service
 * @create 2020-06-03 0:08
 */
public interface AddBlogDAO {
    /**
     * @Description: 添加博客
     * @Param: 前端添加博客数据
     * @return: 返回数字
     * @Author: Mr.Wang
     * @Date: 2020/6/3
     */
    Integer addBlogs(@Param("addBlog") Blog addBlog);
}