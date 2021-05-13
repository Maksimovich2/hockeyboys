package com.mmv.myMMV.controller;

import com.mmv.myMMV.model.Player;
import com.mmv.myMMV.model.Team;
import com.mmv.myMMV.service.PlayerService;
import com.mmv.myMMV.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller

public class TeamController {
    private final TeamService teamService;

    @Autowired
    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping("/teamNHL")
    public String findAllTeamsKHL(Model model){
        List<Team> teams = teamService.findAll();
        model.addAttribute("teams", teams);
        return "team-listNHL";
    }
}
