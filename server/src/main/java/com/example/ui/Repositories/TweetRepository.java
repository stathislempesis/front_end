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
    Page<Tweet> findByUserID(Long userID, Pageable pageable);

    @Query("SELECT t.date, count(t.statusID) FROM Tweet t where t.userID = ?1 group by t.date order by date")
    List<Tweet> countByDateUserID(@Param("userID") Long userID);
}
