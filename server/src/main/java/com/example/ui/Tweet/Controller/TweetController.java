package com.example.ui.Tweet.Controller;

import com.example.ui.Tweet.Entity.Tweet;
import com.example.ui.Tweet.Repository.TweetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TweetController {

    @Autowired
    private TweetRepository tweetRepository;

    @GetMapping("/users/{userId}/tweets")
    public Page<Tweet> getAllCommentsByPostId(@PathVariable(value = "userId") Long userId,
                                              Pageable pageable) {
        return tweetRepository.findByUserId(userId, pageable);
    }
}
