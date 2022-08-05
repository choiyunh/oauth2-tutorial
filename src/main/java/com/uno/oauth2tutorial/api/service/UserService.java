package com.uno.oauth2tutorial.api.service;

import com.uno.oauth2tutorial.api.entity.user.User;
import com.uno.oauth2tutorial.api.repository.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User getUser(String userId) {
        return userRepository.findByUserId(userId);
    }
}
