package org.lanqiao.travel.service;

import org.lanqiao.travel.mapper.ArticleMapper;
import org.lanqiao.travel.mapper.WorkMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SqServiceImpl implements sqService {

    @Autowired
    ArticleMapper articleMapper;
    @Autowired
    WorkMapper workMapper;

    @Override
    public List getAllArticle() {
        return articleMapper.selectAllarticle();
    }

    @Override
    public List getAllWork() {
        return workMapper.selectAllWork() ;
    }
}
