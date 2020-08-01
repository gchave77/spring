package com.tekcamp.module12.Controllers;

import com.tekcamp.module12.Entities.User;
import com.tekcamp.module12.Repositories.UserRepository;
import com.tekcamp.module12.Services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController //convenience annotation instead of @Controller, includes ResponseBody
@RequestMapping("users") //where it's listening

public class UserController {
    private final UserService userService;
    private final UserRepository userRepository;

    public UserController(UserService userService, UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }

    public UserService getUserService() {
        return userService;
    }

    public UserRepository getUserRepository() {
        return userRepository;
    }

    @GetMapping
    public List<User> getUsers(){
        List<User> returnValue = userService.getUsers();
        return returnValue;
    }

    @PostMapping
    public void createBooks(){

    }

    @PutMapping
    public void updateBooks(){

    }

    @DeleteMapping
    public void deleteBooks(){

    }

}
