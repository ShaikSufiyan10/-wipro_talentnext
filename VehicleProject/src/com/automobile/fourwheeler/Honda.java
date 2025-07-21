package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Honda extends Vehicle {

    @Override
    public String getModelName() {
        return "Honda City";
    }

    @Override
    public String getRegistrationNumber() {
        return "TS07XY5678";
    }

    @Override
    public String getOwnerName() {
        return "Sumanth Reddy";
    }

    public int getSpeed() {
        return 120;
    }

    public void cdplayer() {
        System.out.println("CD Player is ON in Honda car.");
    }
}
