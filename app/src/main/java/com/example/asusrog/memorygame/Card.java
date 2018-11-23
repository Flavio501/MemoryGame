package com.example.asusrog.memorygame;

public class Card {
    String name;
    int imageResource;
    int description;

    public Card(String name, int im, int desc){
        this.name = name;
        this.imageResource = im;
        this.description = desc;
    }

    public String getName(){
        return this.name;
    }
    public int getImage(){
        return this.imageResource;
    }
    public int getDesc(){
        return this.description;
    }
}
