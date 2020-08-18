package com.keepit.teste.endpoints;

import com.keepit.teste.entity.Game;
import com.keepit.teste.service.impls.GameServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/game")
public class GameController {

    @Autowired
    private GameServiceImpl gameService;

    @PostMapping
    public Game save(@Valid @RequestBody Game game){
        return gameService.save(game);
    }

    @GetMapping("{id}")
    public Optional<Game> findById(@PathVariable("id") Long id){
        return gameService.findById(id);
    }

    @GetMapping("{name}")
    public List<Game> findByName(@PathVariable("name") String name){
        return gameService.findByName(name);
    }

    @GetMapping("/byUser/{userId}")
    public List<Game> findByUser(@PathVariable("userId") Long userId) {
        return gameService.findByUser(userId);
    }

}
