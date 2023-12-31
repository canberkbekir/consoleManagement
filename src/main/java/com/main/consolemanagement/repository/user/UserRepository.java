package com.main.consolemanagement.repository.user;

import com.main.consolemanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
    User findFirstByUsername(String username);
}
