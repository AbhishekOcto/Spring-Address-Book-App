package com.bridgelabz.addressbookapp.controllers;

import com.bridgelabz.addressbookapp.dto.UserDTO;
import com.bridgelabz.addressbookapp.entity.User;
import com.bridgelabz.addressbookapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * @param user
     * @return
     */
    @PostMapping("/register")
    public User registerUser(@RequestBody User user){
        return userService.registerUser(user);
    }

    /**
     * @param userDTO
     * @return
     */
    @PostMapping("/login")
    public String userLogin(@RequestBody UserDTO userDTO){
        return userService.userLogin(userDTO);
    }

    /**
     * @param token
     * @return
     */
    @GetMapping("/get-all-user")
    public List<User> getAllUsers(@RequestParam String token){
        return userService.getAllUsers(token);
    }

    /**
     * @param token
     * @return
     */
    @GetMapping("/get-user")
    public Optional<User> getUser(@RequestParam String token){
        return userService.getUser(token);
    }

}
