package ru.podlubnyy.springsource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("rapMusic") Music music1, @Qualifier("popMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public void playMusic(Genre genre) {
        Random random = new Random();

        if (genre.equals(Genre.POP)) {
            System.out.println(music2.getSong().get(random.nextInt(3)));
        }
        else if (genre.equals(Genre.RAP)) {
            System.out.println(music1.getSong().get(random.nextInt(3)));
        }
    }
}
