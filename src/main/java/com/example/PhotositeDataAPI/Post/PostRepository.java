package com.example.PhotositeDataAPI.Post;


import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface PostRepository extends MongoRepository<Post, String> {

    Optional<Post> findById(String _id);

}
