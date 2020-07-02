package com.urchin.blog.service;


import com.urchin.blog.entity.Blog;

import java.util.List;

/**
 * @author urchin
 * @Description 查询博客
 * @PROJECT_NAME urchin_blog_service
 * @create 2020-06-05 23:24
 */
public interface ShowBlogService {
    List<Blog> showBlogs();
/**
* @Description:  博客详情页
* @Param:   Id
* @return:  list
* @Author: Mr.Wang
* @Date:   2020-06-05 20：26
*/
    List<Blog> showBlog(Integer id);
}