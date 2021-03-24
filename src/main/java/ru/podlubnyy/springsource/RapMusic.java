package ru.podlubnyy.springsource;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class RapMusic implements Music {

    @Override
    public String getSong() {
        return "Wiz Khalifa feat. Snoop Dog - Purp and Yellow";
    }
}
