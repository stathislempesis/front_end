package com.example.ui.Controllers;


import com.example.ui.Entities.Hashtag;
import com.example.ui.Entities.TrendSentiment;
import com.example.ui.Entities.Tweet;
import com.example.ui.Services.TrendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
public class TrendController
{

    @Autowired
    private TrendService trendService;


    @GetMapping("/trends/{id}/sentiment")
    public List<TrendSentiment> trendSentiment(@PathVariable Long id)
    {
        return trendService.trendSentiment(id);
    }


    @GetMapping("/trends/{id}/hashtags")
    public List<Hashtag> hastags(@PathVariable Long id)
    {
        return trendService.hashtags(id);
    }


    @GetMapping("/trends/{id}/tweets")
    public List<Tweet> tweets(@PathVariable Long id)
    {
        return trendService.tweets(id);
    }


    /*
    @GetMapping("/trends/{id}")
    public Trend getTrend(@PathVariable(value = "id") Long id)
    {
        return trendService.getById(id);
    }
    */

    /*
    @GetMapping("/trends/get/{name}")
    public Trend getTrend(@PathVariable(value = "name") String name)
    {
        return trendService.getByName(name);
    }
    */
}
