package com.example.pase.controller;

import com.example.pase.domain.User;
import com.example.pase.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user/register")
    public User register(User user) {
        user = new User();
        user.setFirstName("Oleksii");
        user.setLastName("Krasnovskyi");
        user.setMiddleName("Something");
        user.setEmail("123@gmail.com");
        user.setNickname("dem14n");
        user.setMobileNumber("8-800-555-35-35");
        return userService.register(user);
    }

    @GetMapping("users")
    public List<User> findAll() {
        return userService.findAll();
    }
}
