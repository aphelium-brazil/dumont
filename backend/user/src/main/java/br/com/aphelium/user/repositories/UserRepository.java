package br.com.aphelium.user.repositories;


import br.com.aphelium.user.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}
