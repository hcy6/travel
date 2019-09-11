package org.lanqiao.travel.mapper;

import org.lanqiao.travel.entity.Article;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ArticleMapper {
    int deleteByPrimaryKey(Integer articleId);

    int insert(Article record);

    int insertSelective(Article record);

    Article selectByPrimaryKey(Integer articleId);

    List<Article> selectAllarticle();

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKey(Article record);
}