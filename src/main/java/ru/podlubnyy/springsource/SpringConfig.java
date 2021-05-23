package ru.podlubnyy.springsource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("musicPlayer.properties")
public class SpringConfig {
    @Bean
    public PopMusic popMusic() {
        return new PopMusic();
    }

    @Bean
    public RapMusic rapMusic() {
        return new RapMusic();
    }

    @Bean
    public InstrumentalMusic instrumentalMusic() { return new InstrumentalMusic(); }

    @Bean
    public List<Music> musicList() {
        return Arrays.asList(popMusic(), rapMusic(), instrumentalMusic());
    }

    @Bean
    @Scope("prototype")
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }


}
