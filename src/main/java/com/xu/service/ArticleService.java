package com.xu.service;

import com.xu.pojo.Article;
import com.xu.pojo.PageBean;

public interface ArticleService {
    //新增文章
    void add(Article article);

    //条件分页查询
    PageBean<Article> list(Integer pageNum, Integer pageSize, Integer categoryId, String state);
}
