package com.codinglab.komek20.models;

public class Tag {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id <= 0) throw new IllegalArgumentException("Argument: " + id);
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.length() == 0) throw new IllegalArgumentException("Argument: " + name);
        this.name = name;
    }

    public Tag(int id, String name) {
        setId(id);
        setName(name);
    }
}
