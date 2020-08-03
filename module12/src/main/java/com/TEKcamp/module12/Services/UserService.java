package com.TEKcamp.module12.Services;

import com.TEKcamp.module12.Entities.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();

    void createUser(User user);

    User getByEmailAddress(String emailAddress);

    User getByUserId(String userId);

    void deleteUser(String userId);

}
