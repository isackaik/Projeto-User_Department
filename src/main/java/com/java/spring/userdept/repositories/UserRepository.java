package com.java.spring.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.java.spring.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
