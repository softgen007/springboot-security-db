package demo.webservices.rest.security.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.webservices.rest.security.db.model.Users;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Integer> {
    Optional<Users> findByName(String username);
}
