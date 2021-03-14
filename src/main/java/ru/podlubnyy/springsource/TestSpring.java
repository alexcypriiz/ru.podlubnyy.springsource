package ru.podlubnyy.springsource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

//        Music music = context.getBean("musicBean", Music.class);

//        MusicPlayer musicPlayer = new MusicPlayer(music);

//        Dependency Injection (DI)
       MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

       MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

       boolean compare = firstMusicPlayer == secondMusicPlayer;

        System.out.println(compare);


        /*
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
*/
        context.close();
    }
}
