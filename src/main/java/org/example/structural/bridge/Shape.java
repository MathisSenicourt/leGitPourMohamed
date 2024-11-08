package org.example.structural.bridge;

public abstract class Shape {

    protected DrawApi drawApi;

    protected Shape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }
    protected abstract void draw();

}
