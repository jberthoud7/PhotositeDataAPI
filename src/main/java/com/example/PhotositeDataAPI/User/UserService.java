package com.example.PhotositeDataAPI.User;

import com.example.PhotositeDataAPI.Post.Post;
import com.example.PhotositeDataAPI.Post.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

import static java.lang.Integer.MAX_VALUE;

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

    public List<Integer> getMostLikedPostsByUser(String username, int count) throws NoSuchElementException {
        try{
            List<Integer> mostLikesList = new ArrayList<Integer>();
            int minLikesInList = 0;
            User user = userRepository.findByUsername(username);
            String[] posts = user.getPosts();

            for(String postId : posts){
                Post post = postRepository.findById(postId).get();
                if(post != null){
                    int currentPostLikes = post.getLikes();
                    if(currentPostLikes >= minLikesInList || mostLikesList.size() < count){
                        if(mostLikesList.size() >= count){
                            mostLikesList.remove(minLikesInList);
                        }
                        mostLikesList.add(currentPostLikes);
                        minLikesInList = Collections.min(mostLikesList);
                    }
                }
            }

            Collections.sort(mostLikesList, Collections.reverseOrder());

            return mostLikesList;
        }
        catch (Exception e){
            System.out.println(e);
            throw new NoSuchElementException("entry does not exist");
        }
    }

    public List<Integer> getMostCommentedPostsByUser(String username, int count) throws NoSuchElementException {
        try{
            List<Integer> mostCommentsList = new ArrayList<Integer>();
            int minCommentsInList = 0;
            User user = userRepository.findByUsername(username);
            String[] posts = user.getPosts();

            for(String postId : posts){
                Post post = postRepository.findById(postId).get();
                if(post != null){
                    int currentPostLikes = post.getComments().length;
                    if(currentPostLikes >= minCommentsInList || mostCommentsList.size() < count){
                        if(mostCommentsList.size() >= count){
                            mostCommentsList.remove(minCommentsInList);
                        }
                        mostCommentsList.add(currentPostLikes);
                        minCommentsInList = Collections.min(mostCommentsList);
                    }
                }
            }

            Collections.sort(mostCommentsList, Collections.reverseOrder());

            return mostCommentsList;
        }
        catch (Exception e){
            System.out.println(e);
            throw new NoSuchElementException("entry does not exist");
        }
    }

    public List<Integer> getMostInteractedPostsByUser(String username, int count) throws NoSuchElementException {
        try{
            List<Integer> mostInteractionsList = new ArrayList<Integer>();
            Integer minInteractionsInList = 0;
            User user = userRepository.findByUsername(username);
            String[] posts = user.getPosts();

            for(String postId : posts){
                Post post = postRepository.findById(postId).get();
                if(post != null){
                    int currentPostInteractions = post.getComments().length + post.getLikes();
                    if(currentPostInteractions >= minInteractionsInList || mostInteractionsList.size() < count){
                        if(mostInteractionsList.size() >= count){
                            mostInteractionsList.remove(minInteractionsInList);
                        }
                        mostInteractionsList.add(currentPostInteractions);
                        minInteractionsInList = Collections.min(mostInteractionsList);
                    }
                }
            }

            Collections.sort(mostInteractionsList, Collections.reverseOrder());

            return mostInteractionsList;
        }
        catch (Exception e){
            System.out.println(e);
            throw new NoSuchElementException("entry does not exist");
        }
    }

}
