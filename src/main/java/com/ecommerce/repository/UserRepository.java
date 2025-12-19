package com.ecommerce.repository;
import java.lang.foreign.Linker.Option;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ecommerce.entity.User;
public class UserRepository extends JpaRepository<User, Long> {
    public Optional<User> findByUserName(String userName);
    public Optional<User> findByEmail(String email);
    public Boolean existsByUserName(String userName);
    public Boolean existsByEmail(String email);
    @Query("SELECT u FROM User u WHERE u.userName = ?1 OR u.email = ?2")

    public Optional<User> findByUserNameOrEmail(@Param("userName") String userName, @Param("email") String email);
    
}

