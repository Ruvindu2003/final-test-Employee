package org.example.services.impl;

import org.example.dto.User;

public interface UserService {
    void register(User user);
    boolean validateLogin(String name, String password);
    User getUserDetails(String name);
}