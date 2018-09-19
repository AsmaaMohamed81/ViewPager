package com.example.asmaa.viewpager;

import java.io.Serializable;

class Model implements Serializable{
    private String title;
    private String cost;

    public Model(String title, String cost) {
        this.title = title;
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
