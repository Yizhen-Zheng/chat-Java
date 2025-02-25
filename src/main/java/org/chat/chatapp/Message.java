package org.chat.chatapp;

public class Message {
    private String user;
    private String message;
//constructor: same name as class, no void / return type
    public Message(){};
    public Message(String user, String message){
        this.user = user;
        this.message = message;
    }
    public  String getUser(){return  user;}
    public  String getMessage(){return  message;}
}
