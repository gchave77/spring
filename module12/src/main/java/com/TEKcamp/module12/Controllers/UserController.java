package com.TEKcamp.module12.Controllers;

import com.TEKcamp.module12.Entities.User;
import com.TEKcamp.module12.Repositories.UserRepository;
import com.TEKcamp.module12.Services.UserService;
import org.springframework.web.bind.annotation.*;

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
        return userService.getUsers();
    }

    @PostMapping
    public void createUser(@RequestBody User user){
        userService.createUser(user);

    }

    @PutMapping
    public void updateUsers(){

    }

    @DeleteMapping
    public void deleteUsers(){

    }

}
