package com.tekcamp.module12.Services.Implementations;

import com.tekcamp.module12.Entities.User;
import com.tekcamp.module12.Repositories.UserRepository;
import com.tekcamp.module12.Services.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service //creates bean for UserController to use
public class UserServiceImplementation implements UserService {
    private final UserRepository userRepository;

    public UserServiceImplementation(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getUsers() {
        List<User> returnValue = new ArrayList<User>();
        returnValue = (List<User>) userRepository.findAll();
        return returnValue;
    }
}
