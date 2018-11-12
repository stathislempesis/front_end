package com.example.ui.Repositories;


import com.example.ui.Entities.Tweet;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;



@Repository
public interface TweetRepository extends JpaRepository<Tweet, Long>
{
    //Page<Tweet> findByUserID(Long userID, Pageable pageable);

    //@Query("SELECT t.date, count(t.statusID) FROM Tweet t where t.userID = ?1 group by t.date order by date")
    //List<Object> countByDateUserID(@Param("userID") Long userID);


    @Query(value="SELECT t.* FROM tweets t JOIN trends_tweets tt ON t.id = tt.tweet_id WHERE tt.trend_id = :trend_id", nativeQuery = true)
    List<Tweet> allByTrendId(@Param("trend_id") Long trend_id);

}
