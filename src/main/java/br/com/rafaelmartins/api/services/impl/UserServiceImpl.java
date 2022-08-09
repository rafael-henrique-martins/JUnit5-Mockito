package br.com.rafaelmartins.api.services.impl;

import br.com.rafaelmartins.api.domain.User;
import br.com.rafaelmartins.api.repositories.UserRepository;
import br.com.rafaelmartins.api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findById(Integer id){
        Optional<User> obj = userRepository.findById(id);
        return obj.orElseThrow(null);
    }
}
