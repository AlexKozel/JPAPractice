package com.JpaPractice.Jpapractice.service;

import com.JpaPractice.Jpapractice.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.List;

@Component
public class UserDaoServiceCommandlineRunner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(UserDaoServiceCommandlineRunner.class);


    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Jack", "Admin");
        repository.save(user);
        log.info("new user is created - " + user);

        Optional<User> userFindOne =  repository.findById(1L);
        log.info("user is retrieved - " + user);

        List<User> users = repository.findAll();
        log.info("all user are retrieved - " + user);

        repository.deleteById(1L);
        log.info("User is deleted- " + user);


    }
}
