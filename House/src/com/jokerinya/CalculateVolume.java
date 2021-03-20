package com.jokerinya;

public class CalculateVolume {
    private int height;
    private int width;
    private int lenght;

    public CalculateVolume(int height, int width, int lenght) {
        this.height = height>0 ? height : 0;
        this.width = width>0 ? width : 0;
        this.lenght = lenght>0 ? lenght : 0;
    }

    public int getVolume() {
        return this.height*this.lenght*this.width;
    }
}
