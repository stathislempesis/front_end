package com.example.ui.Repositories;


import com.example.ui.Entities.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;



@Repository
public interface TweetRepository extends JpaRepository<Tweet, Long>
{

    @Query(value="SELECT t.* FROM tweets t JOIN trends_tweets tt ON t.id = tt.tweet_id WHERE tt.trend_id = :trend_id", nativeQuery = true)
    List<Tweet> allByTrendId(@Param("trend_id") Long trend_id);



    //@Query("SELECT t.timestamp, count(t.twitter_id) FROM Tweet t where t.userID = ?1 group by t.timestamp order by timestamp")
    //@Query("SELECT DATE(t.timestamp), count(t.twitter_id) FROM Tweet t where retweetFlag=0 group by DATE(t.timestamp) order by DATE(t.timestamp)")
    //List<Object> countByDateUserID(@Param("userID") Long userID);
}
