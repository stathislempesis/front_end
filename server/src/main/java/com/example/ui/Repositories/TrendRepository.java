package com.example.ui.Repositories;


import com.example.ui.Entities.Trend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TrendRepository extends JpaRepository<Trend, Long>
{

    @Query(value="FROM Trend trend WHERE trend.id IN (:ids)")
    List<Trend> allByIds(@Param("ids") List<Long> ids);

}
