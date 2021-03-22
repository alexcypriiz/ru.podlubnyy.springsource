package ru.podlubnyy.springsource;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class PopMusic implements Music {
    List<String> list = Arrays.asList("Coldplay - A sky full of stars", "Imagine Dragons - Follow You", "The Irrepressibles - In This Shirt");

    @Override
    public List<String> getSong() {
        return list;
    }
}