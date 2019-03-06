package dev.vepsertine.javafatebackend.Repository;

import dev.vepsertine.javafatebackend.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
}
