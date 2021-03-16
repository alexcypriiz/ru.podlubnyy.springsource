package ru.podlubnyy.springsource;

import org.springframework.stereotype.Component;

@Component
public class RapMusic implements Music {

    @Override
    public String getSong() {
        return "Hollywood";
    }
}
