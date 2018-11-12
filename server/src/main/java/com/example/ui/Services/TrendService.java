package com.example.ui.Services;

import com.example.ui.Entities.Hashtag;
import com.example.ui.Entities.Trend;
import com.example.ui.Entities.Tweet;
import com.example.ui.Entities.TrendSentiment;
import com.example.ui.Exception.ResourceNotFoundException;
import com.example.ui.Repositories.TrendRepository;
import com.example.ui.Repositories.TrendSentimentRepository;
import com.example.ui.Repositories.HashtagRepository;
import com.example.ui.Repositories.TweetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class TrendService
{

    @Autowired
    private TrendRepository trendRepository;

    @Autowired
    private TrendSentimentRepository trendSentimentRepository;

    @Autowired
    private HashtagRepository hashtagRepository;

    @Autowired
    private TweetRepository tweetRepository;


    @Transactional(readOnly=true)
    public List<Trend> getAll()
    {
        return trendRepository.findAll();
    }


    public Trend trend(Long trend_id)
    {
        return trendRepository.findById(trend_id).orElseThrow(() -> new ResourceNotFoundException("Trend", "id", trend_id));
    }


    public List<TrendSentiment> trendSentiment(Long trend_id)
    {
        Trend trend = this.trend(trend_id);

        return trendSentimentRepository.allByTrendId(trend.getId());
    }


    public List<Hashtag> hashtags(Long trend_id)
    {
        Trend trend = this.trend(trend_id);

        return hashtagRepository.allByTrendId(trend.getId());
    }


    public List<Tweet> tweets(Long trend_id)
    {
        Trend trend = this.trend(trend_id);

        return tweetRepository.allByTrendId(trend.getId());
    }


    /*
    @Transactional(readOnly=true)
    public Trend getById(Long id)
    {
        return trendRepository.findById(id).get();
    }
    */

    /*
    @Transactional(readOnly=true)
    public Trend getByName(String name)
    {
        return trendRepository.findByName(name).get(0);
    }
    */
}
