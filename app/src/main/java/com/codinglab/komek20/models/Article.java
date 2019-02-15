package com.codinglab.komek20.models;

public class Article {
    private int id;
    private String title;
    private String content;
    private int imageResource;
    private int videoResource;
    private int categoryId;
    private Category category;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public int getImageResource() {
        return imageResource;
    }

    public int getVideoResource() {
        return videoResource;
    }

    public Category getCategory() {
        return category;
    }
    public int getCategoryId() {
        return categoryId;
    }

    public Article(int id, String title, String content, int imageResource, int videoResource, int categoryId) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.imageResource = imageResource;
        this.videoResource = videoResource;
        this.categoryId = categoryId;
    }
}
