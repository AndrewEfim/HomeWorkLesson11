package by.itacademy.homework.domain;

import by.itacademy.homework.service.Generate;

import java.time.LocalDate;

public class MusicBand {

    @Generate
    private String name;
    @Generate
    private LocalDate since;
    @Generate
    private int members;
    @Generate
    private boolean PlayOrNot;

    public void setName(String name) {
        this.name = name;
    }

    public void setSince(LocalDate since) {
        this.since = since;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    public void setPlayOrNot(boolean playOrNot) {
        PlayOrNot = playOrNot;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", since=" + since +
                ", members=" + members +
                ", PlayOrNot=" + PlayOrNot +
                '}';
    }
}
