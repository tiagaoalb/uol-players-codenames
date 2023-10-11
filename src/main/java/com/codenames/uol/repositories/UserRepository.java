package com.codenames.uol.repositories;

import com.codenames.uol.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
