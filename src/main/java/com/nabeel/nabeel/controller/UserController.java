package com.nabeel.nabeel.controller;

import com.nabeel.nabeel.model.User;
import com.nabeel.nabeel.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
@RestController
@RequestMapping(value = "/api/users")
public class UserController {

    @Autowired
    UserServices userServices ;
    @GetMapping("/getUsers/{id}")
    public List<User> getAllUsers(@PathVariable String id){
        System.out.println("==================\nID = " + id);
        return userServices.getAllUser(id);
    }

    @PostMapping("/addUser")
    public User AddUser(@RequestBody User user){
        return userServices.AddUser(user);
    }
    @GetMapping("/test")
    public String test(){
        return "This Is Testing ";
    }

}
