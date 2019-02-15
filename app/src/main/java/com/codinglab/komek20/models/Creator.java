package com.codinglab.komek20.models;

public class Creator {
    private int id;
    private String lastname;
    private String firstname;
    private String fathername;
    private String email;
    private int avatarResource;

    private String social_vk;
    private String social_twitter;
    private String social_facebook;
    private String social_instagram;

    public int getId() {
        return id;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getFathername() {
        return fathername;
    }

    public String getEmail() {
        return email;
    }

    public int getAvatarResource() {
        return avatarResource;
    }

    public String getSocial_vk() {
        return social_vk;
    }

    public String getSocial_twitter() {
        return social_twitter;
    }

    public String getSocial_facebook() {
        return social_facebook;
    }

    public String getSocial_instagram() {
        return social_instagram;
    }

    public Creator(int id, String lastname, String firstname, String fathername, String email, int avatarResource, String social_vk, String social_twitter, String social_facebook, String social_instagram) {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.fathername = fathername;
        this.email = email;
        this.avatarResource = avatarResource;
        this.social_vk = social_vk;
        this.social_twitter = social_twitter;
        this.social_facebook = social_facebook;
        this.social_instagram = social_instagram;
    }
}
