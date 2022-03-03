package com.sinaon.bookseller.repository;

import com.sinaon.bookseller.model.Role;
import com.sinaon.bookseller.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

/**
 * @Author ksinaon
 * @Created 2/16/2022 1:14 PM
 */
public interface IUserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);

    @Modifying
    @Query("update User set role= :role where username= :username")
    void updateUserRole(@Param("username") String username, @Param("role") Role role);
}
