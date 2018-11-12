package com.example.ui.Repositories;


import com.example.ui.Entities.TrendSentiment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TrendSentimentRepository extends JpaRepository<TrendSentiment, Long>
{

    @Query("SELECT ts FROM TrendSentiment ts WHERE ts.trend_id = :trend_id")
    List<TrendSentiment> allByTrendId(@Param("trend_id") Long trend_id);

}