package com.example.nithra;

import java.io.Serializable;

public class Photopojo implements Serializable {
    private int image;

    public Photopojo(int image) {
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
