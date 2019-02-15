package com.codinglab.komek20.models;

import android.support.annotation.Nullable;

public class Category {
    private int id;
    private String name;

    private Category parent;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Category getParent() {
        return parent;
    }

    public Category(int id, String name, Category parent) {
        this.id = id;
        this.name = name;
        this.parent = parent;
    }
}
