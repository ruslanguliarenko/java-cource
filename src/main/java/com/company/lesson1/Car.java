package com.company.lesson1;

public class Car {
    private int fuelConsumption;
    private int tankVolume;

    public Car(int fuelConsumption, int tankVolume) {
        this.fuelConsumption = fuelConsumption;
        this.tankVolume = tankVolume;
    }

    public int getTankVolume() {
        return tankVolume;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }
}
