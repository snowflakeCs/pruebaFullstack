package com.testing.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "music_styles")
public class MusicStyles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "title")
    private String title;
  @Column(name = "vote_count")
    private int vote_count;

    public MusicStyles() {

    }

    public MusicStyles(String title, int vote_count) {
        super();
        this.title = title;
        this.vote_count = vote_count;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
 
  
    public int getVote() {
        return vote_count;
    }
    public void setVote(int vote_count) {
        this.vote_count = vote_count;
    }
}
