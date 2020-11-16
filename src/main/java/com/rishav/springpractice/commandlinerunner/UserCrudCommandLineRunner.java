package com.rishav.springpractice.commandlinerunner;

import com.rishav.springpractice.model.User;
import com.rishav.springpractice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserCrudCommandLineRunner implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {


        User user1=new User("Rishav","Pandey");
        userRepository.save(user1);

        User user2=new User("Abhay","Raghav");
        userRepository.save(user2);

        List<User> list=userRepository.findAll();

        System.out.println("Before Deletion : "+list);


        System.out.println("With first name : Abhay :"+userRepository.findByFirstName("Abhay"));
        /*userRepository.delete(user1);

        list=userRepository.findAll();

        System.out.println("After Deletion : "+list);
         */



    }
}
