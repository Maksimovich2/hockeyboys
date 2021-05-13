package com.mmv.myMMV.controller;

import com.mmv.myMMV.model.League;
import com.mmv.myMMV.model.Player;
import com.mmv.myMMV.service.LeaguesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller

public class LeagueController {
    private final LeaguesService leaguesService;

    @Autowired
    public LeagueController(LeaguesService leaguesService) {
        this.leaguesService = leaguesService;
    }

    @GetMapping("/league")
    public String findAll(Model model) {
        List<League> league = leaguesService.findAll();
        model.addAttribute("league", league);
        return "leagues-list";
    }

    @GetMapping("/team-listKHL")
    public String ShowAllTeamsKHL(Model model) {
        List<League> leagues = leaguesService.findAll();
        model.addAttribute("leagues", leagues);
        return "team-listKHL";
    }
}
