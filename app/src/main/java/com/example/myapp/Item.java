package com.example.myapp;

public class Item {
    private int id;
    private int WIDTH;
    private int HIGHT;
    private String CONTENT;

    public Item(){
        this.WIDTH=0;
        this.HIGHT=0;
        this.CONTENT="";
    }

    public Item(int WIDTH,int HIGHT,String CONTENT) {
        this.WIDTH=WIDTH;
        this.HIGHT=HIGHT;
        this.CONTENT=CONTENT;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWIDTH() {
        return WIDTH;
    }

    public void setWIDTH(int WIDTH) {
        this.WIDTH = WIDTH;
    }

    public int getHIGHT() {
        return HIGHT;
    }

    public void setHIGHT(int HIGHT) {
        this.HIGHT = HIGHT;
    }

    public String getCONTENT() {
        return CONTENT;
    }

    public void setCONTENT(String CONTENT) {
        this.CONTENT = CONTENT;
    }
}
