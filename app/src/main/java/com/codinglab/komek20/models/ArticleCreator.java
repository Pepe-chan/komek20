package com.codinglab.komek20.models;

public class ArticleCreator {
    private int articleId;
    private Article article;
    private int creatorId;
    private Creator creator;

    public int getArticleId() {
        return articleId;
    }

    public int getCreatorId() {
        return creatorId;
    }

    public ArticleCreator(int articleId, int creatorId) {
        this.articleId = articleId;
        this.creatorId = creatorId;
    }
}
