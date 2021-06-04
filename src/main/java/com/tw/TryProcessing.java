package com.tw;

import processing.core.PApplet;

public class TryProcessing extends PApplet {

    private static final int DIAMETER = 10;
    private static final int WIDTH = 648;
    private static final int HEIGHT = 488;

    private int xCoordinate = 1;

    public static void main(String[] args) {
        PApplet.main("com.tw.TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        int yCoordinate = HEIGHT / 5;
        ellipse(xCoordinate, yCoordinate, DIAMETER, DIAMETER);
        ellipse(xCoordinate * 2, 2 * yCoordinate, DIAMETER, DIAMETER);
        ellipse(xCoordinate * 3, 3 * yCoordinate, DIAMETER, DIAMETER);
        ellipse(xCoordinate * 4, 4 * yCoordinate, DIAMETER, DIAMETER);
        ++xCoordinate;
//        Alternative approach
//        for(int iteration = 1 ;iteration <=4; ++iteration) // Here 4 denotes number of balls
//            ellipse(xCoordinate*iteration, yCoordinate*iteration, DIAMETER, DIAMETER);
    }
}


