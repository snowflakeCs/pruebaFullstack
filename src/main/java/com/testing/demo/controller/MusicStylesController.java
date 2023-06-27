package com.testing.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testing.demo.model.MusicStyles;
import com.testing.demo.repository.MusicStylesRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/styles")
public class MusicStylesController {

    @Autowired
    private MusicStylesRepository musicStylesRepository;

    @GetMapping("styles")
    public List < MusicStyles > getMusicStyles() {
        return this.musicStylesRepository.findAll();
    }
}