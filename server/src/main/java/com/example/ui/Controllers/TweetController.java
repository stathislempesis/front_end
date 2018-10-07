package com.example.ui.Controllers;

import com.example.ui.Entities.Tweet;
import com.example.ui.Repositories.TweetRepository;
import com.example.ui.Services.TweetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class TweetController
{

    @Autowired
    private TweetRepository tweetRepository;

    @Autowired
    private TweetService tweetService;


    /*@GetMapping("/tweets/{id}")
    public Tweet getTweetById(@PathVariable(value = "id") Long tweetId)
    {
        return tweetService.findById(tweetId);
    }*/

    @GetMapping("/users/{userID}/tweets")
    public Page<Tweet> getAllTweetsByUserId(@PathVariable(value = "userID") Long userID, Pageable pageable)
    {
        return tweetRepository.findByUserID(userID, pageable);
    }

}
