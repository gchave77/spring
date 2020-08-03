package com.TEKcamp.module12.Services.Implementations;

import com.TEKcamp.module12.Services.UserService;
import com.TEKcamp.module12.Entities.User;
import com.TEKcamp.module12.Repositories.UserRepository;
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

    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User getByEmailAddress(String emailAddress) {
        return userRepository.findByEmailAddress(emailAddress);
    }

    @Override
    public User getByUserId(String userId){
        return userRepository.findByUserId(userId);
    }

    @Override
    public void deleteUser(String userId) {
        User findUser = userRepository.findByUserId(userId);
        userRepository.delete(findUser);
    }

}
//    @Override
//    public void removeUser(String userId) {
//        UserEntity foundUser = repo.findByUserId(userId);
//        repo.delete(foundUser);
//    }