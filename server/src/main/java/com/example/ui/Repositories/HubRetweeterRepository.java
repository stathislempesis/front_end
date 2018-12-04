package com.example.ui.Repositories;

import com.example.ui.Entities.HubRetweeter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HubRetweeterRepository extends JpaRepository<HubRetweeter, Long> {

    public HubRetweeter findTop1ByOrderByIdDesc();
}
