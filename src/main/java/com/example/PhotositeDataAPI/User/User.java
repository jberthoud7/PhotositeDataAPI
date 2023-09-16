package com.example.PhotositeDataAPI.User;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.core.mapping.Document;

import org.apache.commons.codec.digest.DigestUtils;

import java.util.Date;

@Document(collation = "users")
@EnableMongoAuditing
public class User {

    @Id
    private String id;
    private String username;
    private String hashed_pswd;
    private User[] following;
    @CreatedDate
    private Date createdAt;
    @LastModifiedDate
    private Date updatedAt;

    public User(String _username, String _password){
        username = _username;
        hashed_pswd = DigestUtils.sha256Hex(_password);
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

    public User[] getFollowing() {
        return following;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }
}
