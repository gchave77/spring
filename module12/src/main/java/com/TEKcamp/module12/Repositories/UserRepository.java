package com.TEKcamp.module12.Repositories;

import com.TEKcamp.module12.Entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByEmailAddress(String emailAddress);
//    User findUserById(Long id);
}
