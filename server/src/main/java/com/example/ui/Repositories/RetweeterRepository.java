package com.example.ui.Repositories;

import com.example.ui.Entities.Retweeter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RetweeterRepository extends JpaRepository<Retweeter, Long> {

    // It needs retweeted_user_id argument

    @Query("SELECT DATE(t.timestamp), count(t.retweeter_id) FROM Retweeter t group by DATE(t.timestamp) order by DATE(t.timestamp)")
    List<Object> countByDateRetweetedUserId(@Param("retweeted_user_id") Long retweeted_user_id);

    @Query("select DISTINCT retweeter_id, retweeted_user_id from Retweeter where appUserFlag = ?1")
    List<Object> getTupleRetweeterRetweeted(@Param("appUserFlag") boolean appUserFlag);
}
