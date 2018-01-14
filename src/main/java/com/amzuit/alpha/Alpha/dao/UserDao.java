package com.amzuit.alpha.Alpha.dao;

import com.amzuit.alpha.Alpha.model.User;
import com.amzuit.alpha.Alpha.reposntory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDao {

    @Autowired
    UserRepository userRepository;

    public User createUpdate(User user) {
        return userRepository.save(user);
    }
}
