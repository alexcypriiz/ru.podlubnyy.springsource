package ru.podlubnyy.springsource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class MusicPlayer {
    private RapMusic rapMusic;
    private PopMusic popMusic;

    @Autowired
    public MusicPlayer(RapMusic rapMusic, PopMusic popMusic) {
        this.rapMusic = rapMusic;
        this.popMusic = popMusic;
    }

    public String playMusic() {
        return "Playning: " + rapMusic.getSong() + ". Next: " + popMusic.getSong();
    }
}
