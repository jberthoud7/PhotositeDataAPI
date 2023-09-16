package com.example.PhotositeDataAPI.Post;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

public class Post {

    @Id
    private String id;
    private String image;
    private String caption;
    private String username;
    private int likes;
    private String[] comments;
    @CreatedDate
    private Date createdAt;
    @LastModifiedDate
    private Date updatedAt;

    public Post(String _image, String _caption, String _username){
        image = _image;
        caption = _caption;
        username = _username;
    }

    public String getId(){
        return id;
    }
    public String getImage() {
        return image;
    }

    public String getCaption() {
        return caption;
    }

    public String getUsername() {
        return username;
    }

    public int getLikes() {
        return likes;
    }

    public String[] getComments() {
        return comments;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }
}
