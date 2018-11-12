package com.example.ui.Repositories;


import com.example.ui.Entities.Hashtag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface HashtagRepository extends JpaRepository<Hashtag, Long>
{

    @Query(value="SELECT h.* FROM hashtags h JOIN trends_hashtags th ON h.id = th.hashtag_id WHERE th.trend_id = :trend_id", nativeQuery = true)
    List<Hashtag> allByTrendId(@Param("trend_id") Long trend_id);

}
