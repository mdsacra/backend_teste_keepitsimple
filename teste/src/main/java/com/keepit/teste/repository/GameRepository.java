package com.keepit.teste.repository;

import com.keepit.teste.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

    List<Game> findByNameContaining(String name);

    List<Game> findByUsers(Long userId);
}
