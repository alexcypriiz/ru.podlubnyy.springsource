package ru.podlubnyy.springsource;

import com.sun.security.jgss.GSSUtil;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer2.setName("Chill");
        musicPlayer2.setVolume(55);


        System.out.println(musicPlayer1.getName() + " " + musicPlayer1.getVolume());

        System.out.println(musicPlayer2.getName() + " " +musicPlayer2.getVolume());

        context.close();
    }
}
