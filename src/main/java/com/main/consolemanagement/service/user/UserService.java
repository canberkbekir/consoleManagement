package com.main.consolemanagement.service.user;

import com.main.consolemanagement.model.User;
import com.main.consolemanagement.repository.user.UserRepository;

import java.util.List;
import java.util.UUID;

public interface UserService{
    public User getUserById(UUID id);
    public User getUserByUsername(String username);
    public User createUser(User user);
    public User updateUser(User user);
    public void deleteUser(User user);
    public void deleteUserById(UUID id);
    public void deleteUserByUsername(String username);
    public List<User> getAllUsers();
}
