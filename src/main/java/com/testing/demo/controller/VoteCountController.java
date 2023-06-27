package com.testing.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testing.demo.model.VoteCount;
import com.testing.demo.repository.VoteCountRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/votes")
public class VoteCountController {

    @Autowired
    private VoteCountRepository voteCountRepository;

    @GetMapping("votes")
    public List < VoteCount > getMusicStyles() {
        return this.voteCountRepository.findAll();
    }
}