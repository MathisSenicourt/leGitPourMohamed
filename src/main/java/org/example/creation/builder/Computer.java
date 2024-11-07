package org.example.creation.builder;

public class Computer {

    // propriétés obligatoires
    private String processor;
    private int ram;

    // propriétés optionnelles
    private int storage;
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;


    public Computer() {}

    public Computer(ComputerBuilder builder) {
        this.processor = builder.processor;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }



    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public void setGraphicsCardEnabled(boolean graphicsCardEnabled) {
        isGraphicsCardEnabled = graphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    public void setBluetoothEnabled(boolean bluetoothEnabled) {
        isBluetoothEnabled = bluetoothEnabled;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                ", isGraphicsCardEnabled=" + isGraphicsCardEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}';
    }
    public static class ComputerBuilder {

        // propriétés obligatoires
        private String processor;
        private int ram;

        // propriétés optionnelles
        private int storage = 256;
        private boolean isGraphicsCardEnabled = false;
        private boolean isBluetoothEnabled = false;


        public ComputerBuilder (String processor, int ram) {
            this.processor = processor;
            this.ram = ram;
        }


        public ComputerBuilder storage(int storage) {
            this.storage = storage;
            return this;
        }

        public ComputerBuilder isGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }


        public ComputerBuilder isBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }





    }

}
