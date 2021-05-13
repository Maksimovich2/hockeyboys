package com.mmv.myMMV.service;

import com.mmv.myMMV.model.Player;
import com.mmv.myMMV.model.Team;
import com.mmv.myMMV.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class TeamService {
    private final TeamRepository teamRepository;

    @Autowired

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }
    public List<Team> findAll(){
        return teamRepository.findAll();
    }
    public Team findById(Long id){
        return teamRepository.getOne(id);
    }

    public List<Team> ShowLeagues(){
        return teamRepository.findAll();
    }
}
