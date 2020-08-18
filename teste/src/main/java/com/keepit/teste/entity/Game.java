package com.keepit.teste.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.List;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Game {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    @Column(nullable = false)
    String name;

    @ManyToMany
    @JoinTable(
            name = "users_game",
            joinColumns = @JoinColumn(name = "game_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    List<User> users;


}

