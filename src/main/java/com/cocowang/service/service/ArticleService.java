package com.cocowang.service.service;

import com.cocowang.service.entity.ArticleEntity;
import com.cocowang.service.mapper.ArticleMapper;
import com.cocowang.service.model.ArticleDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    public Boolean saveArticle(ArticleDetail articleDetail){
        ArticleEntity entity = new ArticleEntity();
        if (articleDetail != null){
            entity.setTitle(articleDetail.getTitle());
            entity.setContent(articleDetail.getContent());
            return articleMapper.saveArticle(entity);
        }

        return false;
    }

    public ArticleDetail getArticleModel(int id){
        ArticleDetail model = new ArticleDetail();
        ArticleEntity entity = articleMapper.getArticleEntity(id);
        if (entity!=null){
            model.setTitle(entity.getTitle());
            model.setContent(entity.getContent());
            return model;
        }
        return model;
    }

}
