package com.testing.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.testing.demo.model.MusicStyles;
import com.testing.demo.model.User;
import com.testing.demo.model.VoteCount;
import com.testing.demo.repository.MusicStylesRepository;
import com.testing.demo.repository.UserRepository;
import com.testing.demo.repository.VoteCountRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private MusicStylesRepository musicStylesRepository;
    @Autowired
    private VoteCountRepository voteCountRepository;


    @Override
    public void run(String...args) throws Exception {
        this.userRepository.save(new User("Constanza", "Lopez", "constanza.vlm@hotmail.com"));
        this.userRepository.save(new User("luffi", "monkey", "luffmonke@demoomonkey.com"));
        this.musicStylesRepository.save(new MusicStyles("Jazz", 1));
        this.musicStylesRepository.save(new MusicStyles("Pop",2));
        this.musicStylesRepository.save(new MusicStyles("Rock", 1));
        this.musicStylesRepository.save(new MusicStyles("K-Pop",2));
   
    }
}
