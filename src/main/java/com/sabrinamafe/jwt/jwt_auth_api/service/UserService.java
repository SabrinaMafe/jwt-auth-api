package com.sabrinamafe.jwt.jwt_auth_api.service;


import com.sabrinamafe.jwt.jwt_auth_api.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAllUsers();
    Optional<User> getUserByUsername(String username);
    User saveUser(User user);
}
