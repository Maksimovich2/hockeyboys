package com.mmv.myMMV.repository;

import com.mmv.myMMV.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByLastName(String lastName);
}
