package com.spring.Notes.service;



import com.spring.Notes.dtos.UserDTO;
import com.spring.Notes.models.User;

import java.util.List;

public interface UserService {
    void updateUserRole(Long userId, String roleName);

    List<User> getAllUsers();

    UserDTO getUserById(Long id);
}
