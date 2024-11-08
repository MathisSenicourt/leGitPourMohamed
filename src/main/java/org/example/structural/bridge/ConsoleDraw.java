package org.example.structural.bridge;

public class ConsoleDraw implements DrawApi{
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("Drawing Circle on Console" + x + "," + y + "," + radius);
    }

    @Override
    public void drawSquare(int x, int y, int side) {
        System.out.println("Drawing Square on Console" + x + "," + y + "," + side);
    }

    @Override
    public void drawRectangle(int x, int y, int width, int height) {

    }
}
