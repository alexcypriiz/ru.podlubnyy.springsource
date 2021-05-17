package ru.podlubnyy.springsource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

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
    @Scope("prototype")
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(popMusic(), rapMusic());
    }


}
