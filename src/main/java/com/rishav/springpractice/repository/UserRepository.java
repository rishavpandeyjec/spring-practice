package com.rishav.springpractice.repository;

import com.rishav.springpractice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserRepository extends JpaRepository<User,Long> {
    public List<User> findByFirstName(String firstName);
}
