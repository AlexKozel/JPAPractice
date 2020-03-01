package com.JpaPractice.Jpapractice.service;

import com.JpaPractice.Jpapractice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
