package com.mmv.myMMV.repository;

import com.mmv.myMMV.model.Player;
import com.mmv.myMMV.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
    Team findByName(String name);
}
