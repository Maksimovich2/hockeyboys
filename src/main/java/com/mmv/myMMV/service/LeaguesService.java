package com.mmv.myMMV.service;

import com.mmv.myMMV.model.League;
import com.mmv.myMMV.model.Player;
import com.mmv.myMMV.repository.LeaguesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaguesService {

    private final LeaguesRepository leaguesRepository;

    @Autowired
    public LeaguesService(LeaguesRepository leaguesService) {
        this.leaguesRepository = leaguesService;
    }
    public List<League> findAll(){
        return leaguesRepository.findAll();
    }

    public List<League> ShowLeagues(){
        return leaguesRepository.findAll();
    }
}
