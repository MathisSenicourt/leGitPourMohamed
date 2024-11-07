package org.example.creation.builder;

public class Demo {

    public static void main(String[] args) {

    Computer computer = new Computer.ComputerBuilder("intel",32).build();

    Computer computer1 = new Computer
            .ComputerBuilder("intel",32)
            .storage(512)
            .isBluetoothEnabled(true)
            .build();




    }



}
