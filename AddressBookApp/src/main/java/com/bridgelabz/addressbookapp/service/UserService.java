package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.UserDTO;
import com.bridgelabz.addressbookapp.entity.User;
import com.bridgelabz.addressbookapp.repository.UserRepository;
import com.bridgelabz.addressbookapp.utility.TokenUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private TokenUtility tokenUtility;

    /**
     * To register user details in the database
     * @param user
     * @return
     */
    public User registerUser(User user){
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        return userRepository.save(user);
    }

    /**
     * login using correct credential
     * After successful login generating a token
     * @param userDTO
     * @return
     */
    public String userLogin(UserDTO userDTO){
        Optional<User> userMailId = getUserByEmail(userDTO.getEmailId());
        String token = tokenUtility.createToken(userMailId.get().getUserId());
        return token;
    }

    /**
     * Get user by its email id
     * @param emailId
     * @return
     */
    public Optional<User> getUserByEmail(String emailId) {
        return userRepository.findByEmailId(emailId);
    }

    /**
     * Retrieving user list using token
     * @param token
     * @return
     */
    public List<User> getAllUsers(String token){
        Long id = tokenUtility.decodeToken(token);
        return userRepository.findAll();
    }

    /**
     * Retrieving user by id using token
     * @param token
     * @return
     */
    public Optional<User> getUser(String token){
        Long id = tokenUtility.decodeToken(token);
        return userRepository.findById(String.valueOf(id));
    }

}
