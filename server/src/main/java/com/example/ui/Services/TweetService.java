package com.example.ui.Services;

import com.example.ui.Entities.Tweet;
import com.example.ui.Repositories.TweetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
public class TweetService
{

    @Autowired
    private TweetRepository tweetRepository;

    /*@Transactional(readOnly=true)
    public Tweet findById(Long id)
    {
        return tweetRepository.findById(id).get();
    }*/

}
