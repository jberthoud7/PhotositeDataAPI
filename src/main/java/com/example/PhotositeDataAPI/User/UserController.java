package com.example.PhotositeDataAPI.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/total-likes/{username}")
    public ResponseEntity<Integer> getTotalLikesOnUsersPosts(@PathVariable String username){
        return null;
    }

    @GetMapping("/total-comments/{username}")
    public ResponseEntity<Integer> getTotalCommentsOnUsersPosts(@PathVariable String username){
        return null;
    }

    @GetMapping("/total-interactions/{username}")
    public ResponseEntity<Integer> getTotalInteractionsOnUsersPosts(@PathVariable String username){
        return null;
    }

    @GetMapping("/most-liked-posts/{username}")
    public ResponseEntity<Integer> getMostLikedPostsByUser(@PathVariable String username,
                                                            @RequestParam(name = "count", required = false) int count){
        return null;
    }

    @GetMapping("/most-commented-posts/{username}")
    public ResponseEntity<Integer> getMostCommentedPostsByUser(@PathVariable String username,
                                                                @RequestParam(name = "count", required = false) int count){
        return null;
    }

    @GetMapping("/most-interacted-posts/{username}")
    public ResponseEntity<Integer> getMostInteractedPostsByUser(@PathVariable String username,
                                                                      @RequestParam(name = "count", required = false) int count){
        return null;
    }

    @GetMapping("/liked-by-most/{username}")
    public ResponseEntity<Integer> getLikedByMostUsers(@PathVariable String username,
                                                                      @RequestParam(name = "count", required = false) int count){
        return null;
    }

    @GetMapping("/commented-by-most/{username}")
    public ResponseEntity<Integer> getCommentedByMostUsers(@PathVariable String username,
                                                       @RequestParam(name = "count", required = false) int count){
        return null;
    }

    @GetMapping("/interacted-by-most/{username}")
    public ResponseEntity<Integer> getInteractedByMostUsers(@PathVariable String username,
                                                           @RequestParam(name = "count", required = false) int count){
        return null;
    }
}
