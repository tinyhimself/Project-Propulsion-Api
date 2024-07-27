package com.propulsion.app.propulsion.Helpers;

import com.propulsion.app.propulsion.Models.User;
import com.propulsion.app.propulsion.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBHelpers {

    @Autowired
    private UserRepository userRepo;

    public User getUserById(int userId) {
        // Connect to the database and get user by ID or primary key
        return userRepo.findById((long) userId).orElse(new User());
    }

    public User saveUser(User user) {
        try {
            User userToSave = new User(user.getName(), user.getSurname());
            return userRepo.save(userToSave);
        } catch (Exception e) {
            e.printStackTrace();
            // Handle the exception as needed, e.g., throw a custom exception or return a default user
            return null;
        }
    }
}
