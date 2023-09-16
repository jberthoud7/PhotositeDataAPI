package com.example.PhotositeDataAPI.Post;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/posts")
public class PostController {

    @GetMapping("/total-likes/{post_id}")
    public ResponseEntity<Integer> getTotalLikesOnPost(@PathVariable String post_id){
        return null;
    }

    @GetMapping("/total-comments/{post_id}")
    public ResponseEntity<Integer> getTotalCommentsOnPost(@PathVariable String post_id){
        return null;
    }

    @GetMapping("/total-interactions/{post_id}")
    public ResponseEntity<Integer> getTotalInteractionsOnPost(@PathVariable String post_id){
        return null;
    }

    @GetMapping("/most-liked")
    public ResponseEntity<Integer> getMostLikedPosts(@RequestParam(name= "count", required = false) int count){
        return null;
    }

    @GetMapping("/most-commented")
    public ResponseEntity<Integer> getMostCommentedPosts(@RequestParam(name= "count", required = false) int count){
        return null;
    }

    @GetMapping("/most-interacted")
    public ResponseEntity<Integer> getMostInteractedPosts(@RequestParam(name= "count", required = false) int count){
        return null;
    }
}
