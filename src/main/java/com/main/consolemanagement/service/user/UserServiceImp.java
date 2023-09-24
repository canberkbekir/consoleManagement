package com.main.consolemanagement.service.user;

import com.main.consolemanagement.model.User;
import com.main.consolemanagement.repository.user.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class UserServiceImp implements UserService{

    private final UserRepository userRepository;

    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public User getUserById(UUID id) {
        return userRepository.getById(id);
    }

    @Override
    public User getUserByUsername(String username) {
        return null;
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public void deleteUser(User user) {

    }

    @Override
    public void deleteUserById(UUID id) {

    }

    @Override
    public void deleteUserByUsername(String username) {

    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
