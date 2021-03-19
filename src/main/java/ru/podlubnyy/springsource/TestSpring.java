package ru.podlubnyy.springsource;

import com.sun.security.jgss.GSSUtil;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        PopMusic popMusic = context.getBean("popMusic", PopMusic.class);
        RapMusic rapMusic = context.getBean("rapMusic", RapMusic.class);

        MusicPlayer musicPlayer1 = new MusicPlayer(popMusic);
        musicPlayer1.playMusic();

        MusicPlayer musicPlayer2 = new MusicPlayer(rapMusic);
        musicPlayer2.playMusic();

        context.close();
    }
}
