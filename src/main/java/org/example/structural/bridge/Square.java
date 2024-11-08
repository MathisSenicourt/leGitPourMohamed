package org.example.structural.bridge;

public class Square extends Shape {
    private int side;
    private int x;
    private int y;

    public Square(DrawApi drawApi, int side, int x, int y) {
        super(drawApi);
        this.side = side;
        this.x = x;
        this.y = y;
    }

    @Override
    protected void draw() {
        drawApi.drawSquare(side, y, x);
    }
}
