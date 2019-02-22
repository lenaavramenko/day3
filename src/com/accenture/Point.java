package com.accenture;

public class Point extends Object{
    protected int x = 1;
    public static int y = 2;
//custom constructor

    public Point() {
    ++y;
}

    public Point(int a, int b) {
        x = a;
        y = b;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX(int x) {
        return x;
    }

    public void draw(){
        System.out.println("Drawing point.");
    }

    public void draw(int x, int y){
        System.out.println("Drawing point located at " + x + " / " + y);
    }
}
