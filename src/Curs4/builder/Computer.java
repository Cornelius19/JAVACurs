package Curs4.builder;

import java.util.Locale;

public class Computer {
    private int RAM;
    private String CPU;
    private int storage;
    private String MB;
    private int Battery;
    private String color;
    private String GPU;


    public Computer(Builder builder){
        this.RAM = builder.RAM;
        this.CPU = builder.CPU;
        this.storage = builder.storage;
        this.MB = builder.MB;
        this.Battery = builder.Battery;
        this.color = builder.color;
        this.GPU = builder.GPU;
    }
    public static class Builder {
        private int RAM;
        private String CPU;
        private int storage;
        private String MB;
        private int Battery;
        private String color;
        private String GPU;

        public Builder(String MB, String CPU) {
            this.MB = MB;
            this.CPU = CPU;
        }

        public Computer build() {
            return new Computer(this);
        }

        public Builder setRAM(int RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder setBattery(int battery) {
            Battery = battery;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "RAM=" + RAM +
                    ", CPU='" + CPU + '\'' +
                    ", storage=" + storage +
                    ", MB='" + MB + '\'' +
                    ", Battery=" + Battery +
                    ", color='" + color + '\'' +
                    ", GPU='" + GPU + '\'' +
                    '}';
        }
    }
}
