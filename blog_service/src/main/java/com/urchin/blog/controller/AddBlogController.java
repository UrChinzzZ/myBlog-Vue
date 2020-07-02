package com.urchin.blog.controller;
import com.urchin.blog.entity.Blog;
import com.urchin.blog.service.AddBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.Map;

/**
 * @author urchin
 * @Description
 * @PROJECT_NAME urchin_blog_service
 * @create 2020-06-03 1:09
 */
@CrossOrigin
@RestController
@RequestMapping("/Blog")
public class AddBlogController {
    @Autowired
    AddBlogService addBlogService;
    @RequestMapping("/AddBlog")
    public  Object addBlog(@RequestBody Blog addBlog){
        //数组转成字符串
        addBlog.setBlogTypeString(String.join(",",addBlog.getBlogType()));
        return addBlogService.addBlog(addBlog);
    }
}