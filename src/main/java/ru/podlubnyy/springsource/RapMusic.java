package ru.podlubnyy.springsource;

public class RapMusic implements Music {
    private RapMusic() {}
    String track = "Hollywood";

    public static RapMusic addRapMusic() {
        return new RapMusic();
    }

    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() {
        return track;
    }

    public void setSong(String track) {
        this.track = track;
    }
}
