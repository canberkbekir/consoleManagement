package com.main.consolemanagement.controller;

import com.main.consolemanagement.model.User;
import com.main.consolemanagement.service.user.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "create",consumes = "application/json",produces = "application/json")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping(value = "getAll")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping(value = "getByUsername/{username}")
    public User getAllUsers(@PathVariable String username) {
        return userService.getUserByUsername(username);
    }

}
