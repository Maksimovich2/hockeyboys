package com.mmv.myMMV.service;

import com.mmv.myMMV.model.Player;
import com.mmv.myMMV.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {

    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public Player findById(Long id){
        return playerRepository.getOne(id);
    }

    public List<Player> findAll(){
        return playerRepository.findAll();
    }

    public Player savePlayer(Player user){
        return playerRepository.save(user);
    }
    public Player updatePlayer(Player user){
        Optional<Player> userOptional = playerRepository.findById(user.getId());
        if(userOptional.isPresent()){
            Player playerFromDataBase = userOptional.get();
            playerFromDataBase.setName(user.getName());
            playerFromDataBase.setSurname(user.getSurname());
            playerFromDataBase.setAge(user.getAge());
            playerFromDataBase.setNumber(user.getNumber());
            return playerRepository.save(playerFromDataBase);
        }
        return null;
    }
    public Player searchPlayer(String surname){
       return playerRepository.findBySurname(surname);
    }

    public void deleteById(Long id){
        playerRepository.deleteById(id);
    }
}
