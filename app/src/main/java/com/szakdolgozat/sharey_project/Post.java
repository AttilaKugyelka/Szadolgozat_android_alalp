package com.szakdolgozat.sharey_project;

import android.net.Uri;

public class Post {

    private String username;
    private String topic;
    private String name;
    private Boolean postPublic;
    private Uri postMediaUri;
    private String Description;
    private String createDataStamp;

    public void setPostName(String name){
        this.name=name;
    }

    public void setPostUri(Uri postUri){
        this.postMediaUri=postUri;
    }

    public void setPostDescriptions(String description){
        this.Description=description;
    }

    public String getPostName(){
        return this.name;
    }

    public Uri getPostMediaUri(){
        return this.postMediaUri;
    }

    public String getDescription(){
        return this.Description;
    }
}
