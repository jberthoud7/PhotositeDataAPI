package com.example.PhotositeDataAPI.User;

import com.example.PhotositeDataAPI.Post.Post;
import com.example.PhotositeDataAPI.Post.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final PostRepository postRepository;

    @Autowired
    public UserService(UserRepository _userRepository, PostRepository _postRepository){
        this.userRepository = _userRepository;
        this.postRepository = _postRepository;
    }

    public int getTotalLikesByUser(String username) throws NoSuchElementException {
        try{
            int totalLikes = 0;
            User user = userRepository.findByUsername(username);
            String[] posts = user.getPosts();

            for(String postId : posts){
                Post post = postRepository.findById(postId).get();
                if(post != null){
                    totalLikes += post.getLikes();
                }
            }

            return totalLikes;
        }
        catch (Exception e){
            System.out.println(e);
            throw new NoSuchElementException("entry does not exist");
        }
    }

    public int getTotalCommentsByUser(String username) throws NoSuchElementException {
        try{
            int totalComments = 0;
            User user = userRepository.findByUsername(username);
            String[] posts = user.getPosts();

            for(String postId : posts){
                Post post = postRepository.findById(postId).get();
                if(post != null){
                    totalComments += post.getComments().length;
                }
            }

            return totalComments;
        }
        catch (Exception e){
            System.out.println(e);
            throw new NoSuchElementException("entry does not exist");
        }
    }

}
