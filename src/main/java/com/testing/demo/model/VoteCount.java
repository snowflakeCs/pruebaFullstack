package com.testing.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "vote_count")
public class VoteCount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "music_style_id")
    private MusicStyles musicStyles;

    public VoteCount() {
    }

    public VoteCount(User user, MusicStyles musicStyles) {
        this.user = user;
        this.musicStyles = musicStyles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public MusicStyles getMusicStyle() {
        return musicStyles;
    }

    public void setMusicStyle(MusicStyles musicStyles) {
        this.musicStyles = musicStyles;
    }
}
