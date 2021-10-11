package com.example.pase.service;

import com.example.pase.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User register(User user);

    User findById(Long id);
    User findByNickname(String nickname);

    List<User> findAll();

    void delete(Long id);

}
