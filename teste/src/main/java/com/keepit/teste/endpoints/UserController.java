package com.keepit.teste.endpoints;

import com.keepit.teste.entity.User;
import com.keepit.teste.service.impls.UserServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @PostMapping
    public User save(@Valid @RequestBody User user){
        return userService.save(user);
    }

    @GetMapping
    public List<User> findAll(){
        return userService.findAll();
    }

    @GetMapping("{id}")
    public Optional<User> findById(@PathVariable("id") Long id){
        return userService.findById(id);
    }

    @GetMapping("/byGame/{gameId}")
    public List<User> findByGame(@PathVariable("gameId") Long gameId){
        return userService.findByGame(gameId);
    }

}
