package com.propulsion.app.propulsion.Helpers;

import com.propulsion.app.propulsion.Models.User;
import com.propulsion.app.propulsion.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

import java.util.ArrayList;
import java.util.List;

@Service
public class DBHelpers {

    @Autowired
    private UserRepository userRepo;

    public User getUserById(long userId) {
        // Connect to the database and get user by ID or primary key
       try{
           return userRepo.findById(userId).orElse(new User());
       }catch (Exception e) {
           e.printStackTrace();
           // Handle the exception as needed, e.g., throw a custom exception or return a default user
           return new User();
       }
    }

    public List<User> getAllUsers()
    {
        try{
            /*
            get  all users from database and cast result into List of user then return list of users
             */

           return (List<User>) userRepo.findAll();
        }catch (Exception e) {
            e.printStackTrace();
            // Handle the exception as needed, e.g., throw a custom exception or return an empty List of users
            return new ArrayList<User>();
        }
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

    public User updateUser(User user) {
            try{
                // Retrieve user by ID
                Optional<User> optionalUser = userRepo.findById(user.getId());

                /*
                Check if user exist
                 */
                if (optionalUser.isPresent()) {
                    User Update_existing_User = optionalUser.get(); // Get the user if present

                    Update_existing_User.setName(user.getName()); // Update user details

                    Update_existing_User.setSurname(user.getSurname());

                    return userRepo.save(Update_existing_User); // Save updated user

                }else {
                    return user;
                }
            }catch (Exception e) {
                e.printStackTrace();
                return user;
            }
    }

    public void deleteUser(Long userId) {
        try {
            /*
            Delete user
             */
            userRepo.delete(getUserById(userId));

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}
