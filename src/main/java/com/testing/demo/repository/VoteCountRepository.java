package com.testing.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testing.demo.model.VoteCount;

@Repository
public interface VoteCountRepository extends JpaRepository<VoteCount, Long>{

}