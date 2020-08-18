package com.keepit.teste.repository;

import com.keepit.teste.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByLogin(String login);

    List<User> findByGames(Long gameId);

}
