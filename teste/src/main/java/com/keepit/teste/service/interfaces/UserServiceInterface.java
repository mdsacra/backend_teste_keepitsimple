package com.keepit.teste.service.interfaces;

import com.keepit.teste.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserServiceInterface {

    List<User> findAll();

    Optional<User> findById(Long id);

    List<User> findByGame(Long gameId);

    User save(User user);

}
