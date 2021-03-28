package com.jokerinya;

public class CarRadio {
    private PlayMusic playMusic;
    private String name;

    public CarRadio(String name) {
        this.name = name;
    }

    public void setMakeSound(PlayMusic playMusic) {
        this.playMusic = playMusic;
    }

    public void music(String music){
        this.playMusic.music(music);  // interface object's method.
    }

    public interface PlayMusic {
        void music(String music);
    }
}
