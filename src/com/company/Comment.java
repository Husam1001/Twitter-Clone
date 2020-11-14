package com.company;

import java.util.concurrent.atomic.AtomicInteger;

public class Comment {
    private static final AtomicInteger GENERATOR_id = new AtomicInteger(1);
    private final int id;
    private final String commentDate;
    private final Person commentBy;
    private final Tweet tweet;
    private String comment;
    private int like = 0;
    private int disLike = 0;

    public Comment(String comment, String commentDate, Person commentBy, Tweet tweet) {
        id = GENERATOR_id.getAndIncrement();
        this.comment = comment;
        this.commentDate = commentDate;
        this.commentBy = commentBy;
        this.tweet = tweet;
    }

    public int getId() {
        return id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCommentDate() {
        return commentDate;
    }

    public Person getCommentBy() {
        return commentBy;
    }

    public Tweet getTweet() {
        return tweet;
    }

    public void like() {
        like += 1;
    }

    public void disLike(Person p) {
        disLike += 1;
    }
}
