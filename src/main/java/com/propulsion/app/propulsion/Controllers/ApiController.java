package com.propulsion.app.propulsion.Controllers;

import com.propulsion.app.propulsion.Helpers.DBHelpers;
import com.propulsion.app.propulsion.Models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(value = "/getUserid")
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


    @PostMapping(value = "/insertuser")
    public User insertUser(@RequestBody User user){

        /*
        Save user into database
         */
        return dbHelpers.saveUser(user);
    }

    @PutMapping(value = "/updateuser")
    public User updateUser(@RequestBody User user){
        /*
        Update user details
     */
        return dbHelpers.updateUser(user);
    }

    @DeleteMapping(value = "/deleteuser")
    public User deleteUser(@RequestBody long userId){

        /*
        Get user details before deleted
         */
        User user_to_be_deleted = dbHelpers.getUserById(userId);
        /*
        Delete user
         */
        dbHelpers.deleteUser(userId);

        /*
        Return deleted user
         */
        return user_to_be_deleted;

    }
}