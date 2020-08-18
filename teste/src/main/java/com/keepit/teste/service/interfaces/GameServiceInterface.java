package com.keepit.teste.service.interfaces;

import com.keepit.teste.entity.Game;

import java.util.List;
import java.util.Optional;

public interface GameServiceInterface {

    Game save(Game game);

    List<Game> findAll();

    Optional<Game> findById(Long id);

    List<Game> findByUser(Long userId);

    List<Game> findByName(String name);
}
