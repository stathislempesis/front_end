package com.example.ui.Repositories;

import com.example.ui.Entities.Tweet;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface TweetRepository extends JpaRepository<Tweet, Long>
{
    //Page<Tweet> findByUserID(Long userID, Pageable pageable);

    //@Query("SELECT t.timestamp, count(t.twitter_id) FROM Tweet t where t.userID = ?1 group by t.timestamp order by timestamp")
    @Query("SELECT DATE(t.timestamp), count(t.twitter_id) FROM Tweet t where t.retweet_flag=0 group by DATE(t.timestamp) order by DATE(t.timestamp)")
    List<Object> countByDateUserID(@Param("userID") Long userID);

    @Query("SELECT DATE(t.timestamp), count(t.twitter_id), count(m.reply_id) FROM Tweet t left join Reply m on t.id = m.replied_tweet_id where t.retweet_flag=0 group by DATE(t.timestamp) order by DATE(t.timestamp)")
    List<Object> countByDateUserID2(@Param("userID") Long userID);
}
