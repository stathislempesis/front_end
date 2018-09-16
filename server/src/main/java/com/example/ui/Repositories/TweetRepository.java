package com.example.ui.Repositories;

import com.example.ui.Entities.Tweet;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TweetRepository extends JpaRepository<Tweet, Long> {
    Page<Tweet> findByUserId(Long userId, Pageable pageable);
}
