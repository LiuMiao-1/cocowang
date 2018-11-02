package com.cocowang.service.mapper;

import com.cocowang.service.entity.ArticleEntity;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface ArticleMapper {

    public Boolean saveArticle(ArticleEntity entity);

    public ArticleEntity getArticleEntity(int id);
}
