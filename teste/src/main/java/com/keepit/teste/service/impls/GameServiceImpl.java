package com.keepit.teste.service.impls;

import com.keepit.teste.entity.Game;
import com.keepit.teste.repository.GameRepository;
import com.keepit.teste.service.interfaces.GameServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameServiceImpl implements GameServiceInterface {

    @Autowired
    private GameRepository gameRepository;

    @Override
    public Game save(Game game) {
        return gameRepository.save(game);
    }

    @Override
    public List<Game> findAll() { return gameRepository.findAll(); }

    @Override
    public Optional<Game> findById(Long id) {
        return gameRepository.findById(id);
    }

    @Override
    public List<Game> findByName(String name) {
        return gameRepository.findByNameContaining(name);
    }

    @Override
    public List<Game> findByUser(Long userId) {
        return gameRepository.findByUsers(userId);
    }

}
