package com.example.ui.Repositories;

import java.util.List;

import com.example.ui.Entities.Trend;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



@Repository
public interface TrendRepository extends JpaRepository<Trend, Long>
{
    /*
    @Query("SELECT * FROM Trend t where t.name = ?1")
    List<Trend> findByName(String name);
    */
}
