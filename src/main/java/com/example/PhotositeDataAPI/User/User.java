package com.example.PhotositeDataAPI.User;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "users")
@EnableMongoAuditing
public class User {

    @Id
    private String id;
    private String username;
    private String hashed_pswd;
    private String[] following;
    private String[] posts;
    @CreatedDate
    private Date createdAt;
    @LastModifiedDate
    private Date updatedAt;

    public User(String username, String hashed_pswd){
        this.username = username;
        this.hashed_pswd = hashed_pswd;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getHashed_pswd() {
        return hashed_pswd;
    }

    public String[] getFollowing() {
        return following;
    }

    public String[] getPosts() {
        return posts;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }
}
