package com.keepit.teste.service.impls;

import com.keepit.teste.entity.User;
import com.keepit.teste.repository.UserRepository;
import com.keepit.teste.service.interfaces.UserServiceInterface;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserServiceInterface, UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> findByGame(Long gameId) {
        return userRepository.findByGames(gameId);
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        return Optional.of(userRepository.findByUsername(username))
                .orElseThrow(() -> new UsernameNotFoundException("Usuário não existe!"));
    }
}
