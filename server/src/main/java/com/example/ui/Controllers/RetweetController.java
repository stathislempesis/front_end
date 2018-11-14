package com.example.ui.Controllers;

import com.example.ui.Repositories.RetweetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin(origins = "http://localhost:4200")
public class RetweetController {

    @Autowired
    private RetweetRepository retweetRepository;

    @GetMapping("/users/{retweetedTweet}/retweets")
    public List<Object> getAllRetweetsByRetweetedTweet(@PathVariable(value = "retweetedTweet") Long retweetedTweet)
    {
        return retweetRepository.countByDateRetweetedTweet(retweetedTweet);
    }
}
