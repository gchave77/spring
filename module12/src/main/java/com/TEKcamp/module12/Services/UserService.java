package com.TEKcamp.module12.Services;

import com.TEKcamp.module12.Entities.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();

    void createUser(User user);

    User getUsers(String emailAddress);

//    User getByUserId(Long id);

}
