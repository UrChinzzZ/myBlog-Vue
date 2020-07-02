package com.urchin.blog.controller;

import com.urchin.blog.entity.Blog;
import com.urchin.blog.service.ShowBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @author urchin
 * @Description
 * @PROJECT_NAME urchin_blog_service
 * @create 2020-06-04 22:24
 */

@RestController
@RequestMapping("/Blog")
public class ShowBlogController {
    @Autowired
    ShowBlogService showBlogService;
    @CrossOrigin(origins = "http://localhost:8086",methods = {RequestMethod.POST},maxAge = 3600)
    @PostMapping("/ShowBlogs")
    List<Blog> showBlogs(){
        return  showBlogService.showBlogs();
    }
    /**
    * @Description: 点击查看返回博客
    * @Param:  id
    * @return:  list
    * @Author: Mr.Wang
    * @Date:   2020/6/14 20:45
    */
    @CrossOrigin(origins = "http://localhost:8086",methods = {RequestMethod.GET},maxAge = 3600)
    @GetMapping("/ShowBlog/{getId}")
    List<Blog> showBlog(@PathVariable String getId){
        //非空判断
        Integer id=null;
        if (getId!=null){
             id=Integer.valueOf(getId);
        }else{
             id=0;
        }
        return showBlogService.showBlog(id);
    }
}