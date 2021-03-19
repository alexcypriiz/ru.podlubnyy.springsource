package ru.podlubnyy.springsource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class MusicPlayer {
    private Music music;

    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    @Autowired
    public MusicPlayer(RapMusic rapMusic, PopMusic popMusic) {
        this.rapMusic = rapMusic;
        this.popMusic = popMusic;
    }

    public MusicPlayer() {}

    //IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
            System.out.println("Playing: " + music.getSong());
    }
}
