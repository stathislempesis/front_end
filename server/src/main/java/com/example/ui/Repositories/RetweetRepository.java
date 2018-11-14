package com.example.ui.Repositories;

import com.example.ui.Entities.Retweet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RetweetRepository extends JpaRepository<Retweet, Long> {

    // It needs retweetedTweet argument

    @Query("SELECT DATE(t.timestamp), count(t.retweet) FROM Retweet t group by DATE(t.timestamp) order by DATE(t.timestamp)")
    List<Object> countByDateRetweetedTweet(@Param("retweetedTweet") Long retweetedTweet);
}
