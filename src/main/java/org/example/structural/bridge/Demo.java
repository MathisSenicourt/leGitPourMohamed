package org.example.structural.bridge;

public class Demo {
    public static void main(String[] args) {

        Shape circle = new Circle(5,6,10, new ConsoleDraw());
        circle.draw();

        Shape circle2 = new Circle(5,6,10, new WindowDraw());
        circle2.draw();

        Shape circle3 = new Circle(5,6,10, new PaperDraw());
        circle3.draw();
    }
}
