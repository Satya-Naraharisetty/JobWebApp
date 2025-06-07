package com.sbproj.jobwebapp.repo;

import com.sbproj.jobwebapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
