package com.example.demo;

import javax.validation.constraints.NotNull;

public class Favorite {
    @NotNull
    private String name;
    @NotNull
    private String quest;
    @NotNull
    private String colorOrSpeed;

    public Favorite(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuest() {
        return quest;
    }

    public void setQuest(String quest) {
        this.quest = quest;
    }

    public String getColorOrSpeed() {
        return colorOrSpeed;
    }

    public void setColorOrSpeed(String colorOrSpeed) {
        this.colorOrSpeed = colorOrSpeed;
    }
}
