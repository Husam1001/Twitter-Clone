package com.company;


public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Husam", 21, "1999-6-11", "Hi,i love coding (: ");
        Person p2 = new Person("Ali", 20, "2020-6-11", "#Coding is fun (: ");
        Tweet t1 = new Tweet("Hello World 1", "2020-11-14", p1);
        Tweet t2 = new Tweet("Hello World 2", "2020-11-14", p1);
        Tweet t3 = new Tweet("Hello World 3", "2020-11-14", p2);
        p1.addTweet(t1);
        p1.addTweet(t2);
        p2.addTweet(t3);
        t1.like(p1);
        t1.like(p1);
        t1.disLike(p1);
        Comment c1 = new Comment("Good job", "2020-11-14", p1, t1);
        t1.addComment(c1);
        System.out.println("Likes " + t1.getLike() + "  DisLike " + t1.getDisLike());
        System.out.println(t1.getTweeted().getName());
        System.out.println(p1.getTweet().size());

        for (int i = 0; i < p1.getTweet().size(); i++) {
            System.out.println(p1.getTweet().get(i).getTweet());
        }
    }

    public static void addTweet(Person p) {

    }
}

