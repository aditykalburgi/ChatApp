package com.example.ChatApp.model;

public class ChatMessage {

    private String sender;
    private String content;


    public String getSender(){
        return sender;
    }

    public void setSender(String sender){
        this.sender = sender;
    }

    public String getContent(){
        return content;
    }

    public void setConent(String content ){
        this.content = content;
    }
}
