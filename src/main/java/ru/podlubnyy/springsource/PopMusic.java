package ru.podlubnyy.springsource;

import org.springframework.stereotype.Component;

@Component
public class PopMusic implements Music {

    @Override
    public String getSong() {
        return "A sky full of stars";
    }
}
