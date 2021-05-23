package ru.podlubnyy.springsource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer2.setName("Chill");
        musicPlayer2.setVolume(55);

        System.out.println(musicPlayer1.playMusic() );
        System.out.println(musicPlayer2.playMusic() );

        context.close();
    }
}
