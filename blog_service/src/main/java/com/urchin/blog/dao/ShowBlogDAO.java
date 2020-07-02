package com.urchin.blog.dao;

import com.urchin.blog.entity.Blog;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author urchin
 * @Description
 * @PROJECT_NAME urchin_blog_service
 * @create 2020-06-05 21:38
 */

public interface ShowBlogDAO {
    List<Blog> showBlogs();

    List<Blog> showBlog(@Param("id") Integer id);
}