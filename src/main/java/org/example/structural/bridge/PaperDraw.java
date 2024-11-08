package org.example.structural.bridge;

public class PaperDraw implements DrawApi{
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("Drawing Circle on paper " + x + ", " + y + ", " + radius);
    }

    @Override
    public void drawSquare(int x, int y, int side) {
        System.out.println("Drawing Square on paper " + x + ", " + y + ", " + side);
    }

    @Override
    public void drawRectangle(int x, int y, int width, int height) {
        System.out.println("Drawing Rectangle on paper " + x + ", " + y + ", " + width + ", " + height);
    }
}
