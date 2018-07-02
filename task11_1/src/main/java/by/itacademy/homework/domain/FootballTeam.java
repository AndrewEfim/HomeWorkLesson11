package by.itacademy.homework.domain;

import by.itacademy.homework.service.Generate;

import java.time.LocalDate;

public class FootballTeam {
    @Generate
    private String name;
    @Generate
    private LocalDate since;
    @Generate
    private int numberofplayers;
    @Generate
    private boolean qualification;


    public void setName(String name) {
        this.name = name;
    }

    public void setSince(LocalDate since) {
        this.since = since;
    }

    public void setNumberofplayers(int numberofplayers) {
        this.numberofplayers = numberofplayers;
    }

    public void setQualification(boolean qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "FootballTeam{" +
                "name='" + name + '\'' +
                ", since=" + since +
                ", numberofplayers=" + numberofplayers +
                ", qualification=" + qualification +
                '}';
    }
}
