package ru.podlubnyy.springsource;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> list = new ArrayList<>();

    private String name;
    private int volume;

    public Music getMusic(int id) {
        return list.get(id);
    }

    public void setMusic(List<Music> list) {
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MusicPlayer() {}

  /*  //IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }
  */
    public void playMusic() {
        for (Music music : list) {
            System.out.println("Playing: " + music.getSong());
        }
    }

}
