package com.sinaon.bookseller.security.jwt;

import com.sinaon.bookseller.security.UserPrincipal;
import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author ksinaon
 * @Created 2/17/2022 10:32 AM
 */
public interface IJwtProvider {
    String generateToken(UserPrincipal auth);

    Authentication getAuthentication(HttpServletRequest request);

    boolean validateToken(HttpServletRequest request);
}
