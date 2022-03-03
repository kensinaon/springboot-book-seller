package com.sinaon.bookseller.service;

import com.sinaon.bookseller.model.User;
import com.sinaon.bookseller.security.UserPrincipal;
import com.sinaon.bookseller.security.jwt.IJwtProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

/**
 * @Author ksinaon
 * @Created 2/17/2022 3:22 PM
 */
@Service
public class AuthenticationService implements IAuthenticationService{

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private IJwtProvider jwtProvider;

    @Override
    public User signInAndReturnJWT(User signInRequest){
        System.out.println(" |> CLASS: " + this.getClass().getName() +
                "\n |> METHOD: " + Thread.currentThread().getStackTrace()[1].getMethodName() +
                "\n |> LINE: " + Thread.currentThread().getStackTrace()[1].getLineNumber());
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(signInRequest.getUsername(), signInRequest.getPassword()));


        System.out.println("Authen2");
        UserPrincipal userPrincipal = (UserPrincipal) authentication.getPrincipal();

        System.out.println("Authen3");
        String jwt = jwtProvider.generateToken(userPrincipal);

        System.out.println("Authen4");
        User signInUser = userPrincipal.getUser();

        System.out.println("Authen5");
        signInUser.setToken(jwt);

        return signInUser;
    }
}
