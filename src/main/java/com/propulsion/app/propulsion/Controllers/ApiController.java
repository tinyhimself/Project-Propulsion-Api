package com.propulsion.app.propulsion.Controllers;

import com.propulsion.app.propulsion.Models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping(value = "/")
    public String getPage()
    {
        return "Welcome";
    }

    @PostMapping(value = "/getUserID")
    public User getUserID(@RequestBody String userId)
    {
        User user = new User();
        user.setId(Integer.parseInt(userId));
        return user;
    }
}