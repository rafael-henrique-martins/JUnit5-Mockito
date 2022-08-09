package br.com.rafaelmartins.api.repositories;

import br.com.rafaelmartins.api.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
