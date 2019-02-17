package com.example.ui.Repositories;

import com.example.ui.Entities.Reply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReplyRepository extends JpaRepository<Reply, Long> {
    //@Query("SELECT DATE(t.timestamp), count(*) FROM Reply t where t.userIdOfRepliedTweet=:userID group by DATE(t.timestamp) order by DATE(t.timestamp)")
    @Query("SELECT DATE(t.timestamp), count(*) FROM Reply t group by DATE(t.timestamp) order by DATE(t.timestamp)")
    List<Object> countRepliesByDate();

    @Query("SELECT DATE(t.timestamp), count(*) FROM Reply t where DATE(t.timestamp) in :arr_dates group by DATE(t.timestamp) order by DATE(t.timestamp)")
    List<Object> countRepliesInDatesByDate(@Param("arr_dates") List<Object> arr_dates);
}
