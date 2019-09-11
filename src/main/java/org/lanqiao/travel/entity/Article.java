package org.lanqiao.travel.entity;

import java.util.Date;

public class Article {
    private Integer articleId;

    private Integer userId;

    private String idBest;

    private String hot;

    private Date articleTime;

    private String articleAddress;

    private String articleLocal;

    private String articleImg;

    private String articleFace;

    private String articleContent;

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getIdBest() {
        return idBest;
    }

    public void setIdBest(String idBest) {
        this.idBest = idBest == null ? null : idBest.trim();
    }

    public String getHot() {
        return hot;
    }

    public void setHot(String hot) {
        this.hot = hot == null ? null : hot.trim();
    }

    public Date getArticleTime() {
        return articleTime;
    }

    public void setArticleTime(Date articleTime) {
        this.articleTime = articleTime;
    }

    public String getArticleAddress() {
        return articleAddress;
    }

    public void setArticleAddress(String articleAddress) {
        this.articleAddress = articleAddress == null ? null : articleAddress.trim();
    }

    public String getArticleLocal() {
        return articleLocal;
    }

    public void setArticleLocal(String articleLocal) {
        this.articleLocal = articleLocal == null ? null : articleLocal.trim();
    }

    public String getArticleImg() {
        return articleImg;
    }

    public void setArticleImg(String articleImg) {
        this.articleImg = articleImg == null ? null : articleImg.trim();
    }

    public String getArticleFace() {
        return articleFace;
    }

    public void setArticleFace(String articleFace) {
        this.articleFace = articleFace == null ? null : articleFace.trim();
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent == null ? null : articleContent.trim();
    }
}