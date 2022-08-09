package br.com.rafaelmartins.api.services;

import br.com.rafaelmartins.api.domain.User;

public interface UserService {

    User findById(Integer id);
}
