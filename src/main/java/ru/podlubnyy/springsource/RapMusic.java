package ru.podlubnyy.springsource;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class RapMusic implements Music {
    List<String> list = Arrays.asList("Post Malone feat. 21 Savage - RockStar", "Meek Mill feat. Drake - Going Bad", "Wiz Khalifa feat. Snoop Dog - Purp and Yellow");

    @Override
    public List<String> getSong() {
        return list;
    }
}
