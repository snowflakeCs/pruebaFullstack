package com.testing.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testing.demo.model.MusicStyles;

@Repository
public interface MusicStylesRepository extends JpaRepository<MusicStyles, Long>{

}