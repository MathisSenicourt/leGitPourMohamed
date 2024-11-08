package org.example.structural.bridge;

public class WindowDraw implements DrawApi{
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("Drawing Circle on window" + x + y + radius);
    }

    @Override
    public void drawSquare(int x, int y, int side) {
        System.out.println("Drawing Square on window" + x + y + side);
    }

    @Override
    public void drawRectangle(int x, int y, int width, int height) {

    }
}
