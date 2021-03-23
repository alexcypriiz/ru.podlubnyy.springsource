package ru.podlubnyy.springsource;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class PopMusic implements Music {

    @Override
    public String getSong() {
        return "The Irrepressibles - In This Shirt";
    }
}