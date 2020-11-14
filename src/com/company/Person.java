package com.company;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Person {
    private static final AtomicInteger ID_GENERATOR = new AtomicInteger(1000);
    private final int id;
    private final ArrayList<Tweet> tweet = new ArrayList();
    private String name;
    private int age;
    private String DOB;
    private String description;

    public Person(String name, int age, String DOB, String description) {
        id = ID_GENERATOR.getAndIncrement();
        this.name = name;
        this.age = age;
        this.DOB = DOB;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void addTweet(Tweet t) {
        tweet.add(t);
    }

    public ArrayList<Tweet> getTweet() {
        return tweet;
    }
}
