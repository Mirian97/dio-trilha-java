package com.dio.challenge.domain;

public abstract class Content {
    private String title;
    private String description;
    protected static final double XP_DEFAULT = 10d;

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public abstract double calculateXp();
}