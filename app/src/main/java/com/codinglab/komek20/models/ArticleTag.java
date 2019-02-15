package com.codinglab.komek20.models;

public class ArticleTag {
    private int articleId;
    private Article article;
    private int tagId;
    private Tag tag;

    public int getArticleId() {
        return articleId;
    }

    public int getTagId() {
        return tagId;
    }

    public ArticleTag(int articleId, int tagId) {
        this.articleId = articleId;
        this.tagId = tagId;
    }
}
