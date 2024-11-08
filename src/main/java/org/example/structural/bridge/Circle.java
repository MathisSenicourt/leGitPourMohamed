package org.example.structural.bridge;

public class Circle extends Shape {

    private int x;
    private int y;
    private int radius;


    protected Circle(int x, int y, int radius, DrawApi drawApi) {
        super(drawApi);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    protected void draw() {
        drawApi.drawCircle(x, y, radius);

    }
}
