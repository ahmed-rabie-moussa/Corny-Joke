package com.rabie.cornyjoke;

public class JokeModel {
    private int joke_id;
    private String joke_content;
    private int joke_upvotes;
    private int joke_downvotes;

    public JokeModel(int joke_id, String joke_content, int joke_upvotes, int joke_downvotes) {
        this.joke_id = joke_id;
        this.joke_content = joke_content;
        this.joke_upvotes = joke_upvotes;
        this.joke_downvotes = joke_downvotes;
    }

    public int getJoke_id() {
        return joke_id;
    }

    public void setJoke_id(int joke_id) {
        this.joke_id = joke_id;
    }

    public String getJoke_content() {
        return joke_content;
    }

    public void setJoke_content(String joke_content) {
        this.joke_content = joke_content;
    }

    public int getJoke_upvotes() {
        return joke_upvotes;
    }

    public void setJoke_upvotes(int joke_upvotes) {
        this.joke_upvotes = joke_upvotes;
    }

    public int getJoke_downvotes() {
        return joke_downvotes;
    }

    public void setJoke_downvotes(int joke_downvotes) {
        this.joke_downvotes = joke_downvotes;
    }

}
