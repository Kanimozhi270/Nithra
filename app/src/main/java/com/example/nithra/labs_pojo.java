package com.example.nithra;

public class labs_pojo {

    private int image;
    private String url;
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public labs_pojo(int image, String url, String text) {
        this.image = image;
        this.url = url;
        this.text = text;

    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}





