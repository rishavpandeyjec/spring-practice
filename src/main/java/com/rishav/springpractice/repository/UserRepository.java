package com.rishav.springpractice.repository;

import com.rishav.springpractice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
