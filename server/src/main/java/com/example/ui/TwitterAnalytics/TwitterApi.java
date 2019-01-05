package com.example.ui.TwitterAnalytics;


import com.example.ui.TwitterAnalytics.ConfigManager.Config;
import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;
import twitter4j.conf.Configuration;

public class TwitterApi
{

    private Twitter twitter = null;
    private Configuration config = null;


    private TwitterApi()
    {
        ConfigurationBuilder confBuilder = new ConfigurationBuilder();

        confBuilder.setDebugEnabled(true)
                .setOAuthConsumerKey(Config.twitter_api().CONSUMER_KEY)
                .setOAuthConsumerSecret(Config.twitter_api().CONSUMER_SECRET)
                .setOAuthAccessToken(Config.twitter_api().ACCESS_TOKEN)
                .setOAuthAccessTokenSecret(Config.twitter_api().ACCESS_TOKEN_SECRET)
                .setTweetModeExtended(true);

        this.config = confBuilder.build();

        TwitterFactory twitterFactory = new TwitterFactory(this.config);

        this.twitter = twitterFactory.getInstance();
    }


    private static class SingletonHelper
    {
        private static final TwitterApi INSTANCE = new TwitterApi();
    }


    public static Twitter client()
    {
        return SingletonHelper.INSTANCE.twitter;
    }

}
