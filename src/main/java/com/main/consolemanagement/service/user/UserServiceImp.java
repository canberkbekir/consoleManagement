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
        return userRepository.getReferenceById(id);
    }

    @Override
    public User getUserByUsername(String username) {
        return userRepository.findFirstByUsername(username);
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
        userRepository.delete(user);
    }

    @Override
    public void deleteUserById(UUID id) {
        userRepository.deleteById(id);
    }

    @Override
    public void deleteUserByUsername(String username) {
        User user = userRepository.findFirstByUsername(username);
        userRepository.delete(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
