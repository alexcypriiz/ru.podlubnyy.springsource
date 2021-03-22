package ru.podlubnyy.springsource;

import com.sun.security.jgss.GSSUtil;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic(Genre.RAP);
        musicPlayer.playMusic(Genre.POP);
        context.close();
    }
}
