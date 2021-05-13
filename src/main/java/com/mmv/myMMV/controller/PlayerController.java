package com.mmv.myMMV.controller;

import com.mmv.myMMV.model.Player;
import com.mmv.myMMV.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller

public class PlayerController {

    private final PlayerService userService;

    @Autowired
    public PlayerController(PlayerService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public String findAll(Model model){
        List<Player> users = userService.findAll();
        model.addAttribute("users", users);
        return "user-list";
    }

    @GetMapping("/user-create")
    public String createUserForm(Player player){
        return "user-create";
    }

    @PostMapping("/user-create")
    public String createUser(Player player){
        userService.savePlayer(player);
        return "redirect:/users";
    }

    @GetMapping("user-delete/{id}")
    public String deleteUser(@PathVariable("id") Long id){
        userService.deleteById(id);
        return "redirect:/users";
    }

    @GetMapping("/user-update/{id}")
    public String updateUserForm(@PathVariable("id") Long id, Model model){
        Player player = userService.findById(id);
        model.addAttribute("user", player);
        return "user-update";
    }

    @PostMapping("/user-update")
    public String updateUser(Player player){
        userService.updatePlayer(player);
        return "redirect:/users";
    }
    @GetMapping("/user-search")
    public String searchUser(String lastName){
        userService.searchPlayer(lastName);
        return "user-search";
    }
}
