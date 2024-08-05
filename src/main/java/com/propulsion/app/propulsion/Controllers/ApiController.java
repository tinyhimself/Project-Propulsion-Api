package com.propulsion.app.propulsion.Controllers;

import com.propulsion.app.propulsion.Helpers.DBHelpers;
import com.propulsion.app.propulsion.Models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController {
    @Autowired
    private DBHelpers dbHelpers;

    @GetMapping(value = "/")
    public String getPage()
    {
        return "Welcome";
    }

    @GetMapping(value = "/getUserID")
    public User getUserID(@RequestBody long userId)
    {
        /*
        Get User by ID
         */
        return dbHelpers.getUserById(userId);
    }

    @GetMapping(value = "/getallusers")
    public List<User> getAllUsers(){
        /*
        Get all users
         */
        return dbHelpers.getAllUsers();
    }


    @PostMapping(value = "/insertUser")
    public User insertUser(@RequestBody User user){

        /*
        Save user into database
         */
        return dbHelpers.saveUser(user);
    }

    @PostMapping(value = "/UpdateUser")
    public User updateUser(@RequestBody User user){
        /*
        Update user details
         */
        return dbHelpers.updateUser(user);
    }
}