package com.sinaon.bookseller.service;

import com.sinaon.bookseller.model.User;

/**
 * @Author ksinaon
 * @Created 2/17/2022 3:22 PM
 */
public interface IAuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
