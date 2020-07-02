package com.urchin.blog.entity;

import lombok.Data;

import java.util.List;

/**
 * @author urchin
 * @Description 添加博客实体类
 * @PROJECT_NAME urchin_blog_service
 * @create 2020-06-02 23:38
 */
@Data
public class Blog {
    /**
     * 作者
     */
    private   String author;
    private   int    id;
    //博客文章
    private   String body;
    //文章标题
    private  String title;
    private  List   blogType;
    private  String blogTypeString;
    //博客分类
}