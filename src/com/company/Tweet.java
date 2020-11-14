package com.company;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Tweet {
    private static final AtomicInteger ID = new AtomicInteger(1);
    private final int tweetId;
    private final String tweetedDate;
    private final Person tweeted;
    private final ArrayList<Person> likeBy = new ArrayList<>();
    private final ArrayList<Person> disLikeBy = new ArrayList<>();
    private final ArrayList<Comment> comments = new ArrayList<>();
    private String tweet;
    private int like = 0;
    private int disLike = 0;

    public Tweet(String tweet, String tweetedDate, Person tweeted) {
        tweetId = ID.getAndIncrement();
        this.tweet = tweet;
        this.tweetedDate = tweetedDate;
        this.tweeted = tweeted;
    }

    public int getTweetId() {
        return tweetId;
    }

    public String getTweet() {
        return tweet;
    }

    public void setTweet(String tweet) {
        this.tweet = tweet;
    }

    public String getTweetedDate() {
        return tweetedDate;
    }

    public int getLike() {
        return like;
    }

    public int getDisLike() {
        return disLike;
    }

    public ArrayList<Person> getLikeBy() {
        return likeBy;
    }

    public ArrayList<Person> getDisLikeBy() {
        return disLikeBy;
    }

    public void like(Person p) {
        if (!likeBy.contains(p)) {
            likeBy.add(p);
            like += 1;
        }
    }

    public void disLike(Person p) {
        if (!disLikeBy.contains(p)) {
            disLikeBy.add(p);
            disLike += 1;
        }
    }

    public Person getTweeted() {
        return tweeted;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }
}
