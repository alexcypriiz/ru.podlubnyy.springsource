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

        //scope=prototype "compare object"
        secondMusicPlayer.setName("My new Musical");
        secondMusicPlayer.setVolume(75);

        System.out.printf("FirstMusicPlayer: %s %d \n", firstMusicPlayer.getName(), firstMusicPlayer.getVolume());
        System.out.printf("SecondMusicPlayer: %s %d \n", secondMusicPlayer.getName(), secondMusicPlayer.getVolume());

        /*
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
*/
        context.close();
    }
}
