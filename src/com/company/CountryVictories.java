package com.company;

public class CountryVictories {
    String name;
    int gold=0;
    int silver=0;
    int bronze=0;

    public CountryVictories(String name){
        this.name=name;
    }
    public void inrSilver(){
        this.silver++;
    }
    public void inrGold(){
        this.gold++;
    }
    public void inrBronze(){
        this.bronze++;

    }
    public String getName(){
        return this.name;
    }
}
