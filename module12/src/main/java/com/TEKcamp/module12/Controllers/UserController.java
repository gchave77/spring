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

    //    Retrieving a list of all the users and returning it as a response
    @GetMapping
    public List<User> getUsers(){
        return userService.getUsers();
    }

    //    Retrieving a specific user by their email address and returning the user as a response
    @GetMapping(path = "/{emailAddress}")
    public User getUser(@PathVariable String emailAddress){
        return (User) userService.getUsers(emailAddress);
    }

    //    Retrieving a specific user by their ID and returning the user as a response
//    @GetMapping(path = "/{id}")
//    public User getUserById(@PathVariable String id){
//        return (User) userService.getUsers(id);
//    }

    //    Storing a user in the database
    @PostMapping
    public void createUser(@RequestBody User user){
        userService.createUser(user);

    }

    //    Updating a user in the database (Hint: find the user, set the fields from the request body, and save it again) (Make sure you test that the user has been correctly modified)
    @PutMapping
    public void updateUsers(){

    }

    //    Deleting a user from your database (Make sure that you test that the user has been correctly removed)
    @DeleteMapping
    public void deleteUsers(){

    }

}
