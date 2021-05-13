package com.mmv.myMMV.repository;

import com.mmv.myMMV.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
    Player findBySurname(String surname);
}
