package com.hcomany.controller;

import com.hcomany.hwallet.HwalletApplication;
import com.hcomany.hwallet.pojo.UserDetails;
import com.hcomany.hwallet.service.UserService;
import com.hcomany.hwallet.service.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("hwallet/userservice")
public class UserController {

    public static final Logger logger = LoggerFactory.getLogger(HwalletApplication.class);

    UserService userService = new UserServiceImpl();

    @RequestMapping(value = "/register/", method = RequestMethod.POST)
    public ResponseEntity<UserDetails> registerUser(@Valid @RequestBody UserDetails user, UriComponentsBuilder ucBuilder) {
        UserDetails userInfo = userService.registerUser(user);
        if (userInfo != null)
            return new ResponseEntity<UserDetails>(userInfo, HttpStatus.OK);
        else
            return new ResponseEntity<UserDetails>(userInfo, HttpStatus.BAD_REQUEST);
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public ResponseEntity<UserDetails> getUserInfo(@PathVariable("id") String userID) {
        UserDetails userInfo = userService.getUserInfo(userID);
        if (userInfo != null)
            return new ResponseEntity<UserDetails>(userInfo, HttpStatus.OK);
        else
            return new ResponseEntity<UserDetails>(userInfo, HttpStatus.BAD_REQUEST);
    }

    @RequestMapping(value = "/validateuser/{id}/{password}", method = RequestMethod.GET)
    public ResponseEntity<UserDetails> getUserInfo(@PathVariable("id") String userID ,@PathVariable("password") String password) {
        UserDetails userInfo = userService.authenticUser(userID,password);
        if (userInfo != null)
            return new ResponseEntity<UserDetails>(userInfo, HttpStatus.OK);
        else
            return new ResponseEntity<UserDetails>(userInfo, HttpStatus.BAD_REQUEST);
    }
}
