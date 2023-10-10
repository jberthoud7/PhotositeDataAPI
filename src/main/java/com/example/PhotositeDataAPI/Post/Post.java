package com.example.PhotositeDataAPI.Post;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "posts")
@EnableMongoAuditing
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

    public Post(String image, String caption, String username){
        this.image = image;
        this.caption = caption;
        this.username = username;
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
