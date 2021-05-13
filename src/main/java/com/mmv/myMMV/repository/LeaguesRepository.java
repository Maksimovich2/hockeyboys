package com.mmv.myMMV.repository;

import com.mmv.myMMV.model.League;
import com.mmv.myMMV.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaguesRepository extends JpaRepository<League, Integer> {
    League findByLeaguesName(String name);
}
