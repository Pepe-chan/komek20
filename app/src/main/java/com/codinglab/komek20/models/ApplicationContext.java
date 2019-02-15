package com.codinglab.komek20.models;

import java.util.ArrayList;

public class ApplicationContext {

    private ArrayList<Article> articles;
    private ArrayList<ArticleTag> articleTags;
    private ArrayList<Category> categories;
    private ArrayList<Creator> creators;
    private ArrayList<Tag> tags;
    private ArrayList<ArticleCreator> articleCreators;

    public ArrayList<Article> getArticles() {
        return articles;
    }

    public ArrayList<ArticleTag> getArticleTags() {
        return articleTags;
    }

    public ArrayList<Category> getCategories() {
        return categories;
    }

    public ArrayList<Creator> getCreators() {
        return creators;
    }

    public ArrayList<Tag> getTags() {
        return tags;
    }

    public ArrayList<ArticleCreator> getArticleCreators() {
        return articleCreators;
    }

    public ApplicationContext() {
        tags = new ArrayList<Tag>();
        tags.add(new Tag(1, "Games"));
        tags.add(new Tag(2, "Programming"));
        tags.add(new Tag(3, "Films"));
        tags.add(new Tag(4, "Books"));
        tags.add(new Tag(5, "Technologies"));

        categories = new ArrayList<>();
        Category economicCategory = new Category(1, "Economic", null);
        categories.add(economicCategory);
        categories.add(new Category(2, "Social", null));
        categories.add(new Category(3, "Finance", economicCategory));
        categories.add(new Category(4, "Corruption", economicCategory));

        creators = new ArrayList<>();
        creators.add(new Creator(1, "Abraham", "Nurbek", "Iliyasovich", "abr@mail.com", 0, "", "", "", ""));
        creators.add(new Creator(2, "Abraham", "Iliyas", "Bolatovich", "abr20@mail.com", 0, "", "", "", ""));
        creators.add(new Creator(3, "Lucashenko", "Alexander", "Grigorievich", "abr30@mail.com", 0, "", "", "", ""));

        articles = new ArrayList<>();
        articles.add(new Article(1, "CL-24", "asf asdf asdf sd fsdf asdf asdf asd fasdf s", 0, 0, 1));
        articles.add(new Article(2, "CL-25", "sdf g dfghfgjgfjgk hj hk fg jfgj f", 0, 0, 4));
        articles.add(new Article(3, "CL-5", " ert er ttret yr rthert rtertg ", 0, 0, 2));

        articleTags = new ArrayList<>();
        articleTags.add(new ArticleTag(1, 1));
        articleTags.add(new ArticleTag(1, 2));
        articleTags.add(new ArticleTag(2, 2));
        articleTags.add(new ArticleTag(2, 3));
        articleTags.add(new ArticleTag(2, 5));

        articleCreators = new ArrayList<>();
        articleCreators.add(new ArticleCreator(1, 1));
        articleCreators.add(new ArticleCreator(1, 2));
        articleCreators.add(new ArticleCreator(2, 3));
        articleCreators.add(new ArticleCreator(3, 3));
    }
}
