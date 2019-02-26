package controllers;

public class Greetings {

    private long id;
    private String content;

    public Greetings(long id, String content){
        this.id = id;
        this.content = content;
    }

    public long getId(){
        return id;
    }

    public String getContent(){
        return content;
    }
}
