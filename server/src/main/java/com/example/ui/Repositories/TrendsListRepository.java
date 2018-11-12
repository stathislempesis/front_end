package com.example.ui.Repositories;


import com.example.ui.Entities.TrendsList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;


@Repository
public interface TrendsListRepository extends JpaRepository<TrendsList, Long>
{

    @Query(value="SELECT * FROM trends_lists WHERE timestamp < :date ORDER BY timestamp DESC LIMIT :number_to_fetch", nativeQuery = true)
    List<TrendsList> closestToDate(@Param("date") Date date, @Param("number_to_fetch") Integer number_to_fetch);

}
