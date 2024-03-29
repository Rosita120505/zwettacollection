package com.rositasrs.cobalogin.repository;

import com.rositasrs.cobalogin.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByUserNameAndPassword (String userName, String password);

    Optional<User> findByUserName(String userName);

}
