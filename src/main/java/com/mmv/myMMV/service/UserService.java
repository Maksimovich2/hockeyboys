package com.mmv.myMMV.service;

import com.mmv.myMMV.model.User;
import com.mmv.myMMV.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findById(Long id){
        return userRepository.getOne(id);
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User saveUser(User user){
        return userRepository.save(user);
    }
    public User updateUser(User user){
        Optional<User> userOptional = userRepository.findById(user.getId());
        if(userOptional.isPresent()){
            User userFromDataBase = userOptional.get();
            userFromDataBase.setFirstName(user.getFirstName());
            userFromDataBase.setLastName(user.getLastName());
            userFromDataBase.setNumberJ(user.getNumberJ());
            return userRepository.save(userFromDataBase);
        }
        return null;
    }

    public void deleteById(Long id){
        userRepository.deleteById(id);
    }
}
