package com.sinaon.bookseller.controller;

import com.sinaon.bookseller.model.User;
import com.sinaon.bookseller.service.IAuthenticationService;
import com.sinaon.bookseller.service.IUserService;
import com.sinaon.bookseller.util.MyDebugger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ksinaon
 * @Created 2/17/2022 3:40 PM
 */
@RestController
@RequestMapping("api/authentication") // pre-path
public class AuthenticationController {

    @Autowired
    private IAuthenticationService authenticationService;

    @Autowired
    private IUserService userService;

    @PostMapping("sign-up")
    public ResponseEntity<User> signUp(@RequestBody User user){

        if(userService.findUserByUsername(user.getUsername()).isPresent()){
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }

        return new ResponseEntity<>(userService.saveUser(user), HttpStatus.CREATED);
    }

    @PostMapping("sign-in")
    public ResponseEntity<User> signIn(@RequestBody User user){
        System.out.println(" |> CLASS: " + this.getClass().getName() +
                "\n |> METHOD: " + Thread.currentThread().getStackTrace()[1].getMethodName() +
                "\n |> LINE: " + Thread.currentThread().getStackTrace()[1].getLineNumber());
        return new ResponseEntity<>(authenticationService.signInAndReturnJWT(user), HttpStatus.OK);
    }
}
