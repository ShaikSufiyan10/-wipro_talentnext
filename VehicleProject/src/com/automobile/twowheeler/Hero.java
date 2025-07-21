package com.automobile.twowheeler;
import com.automobile.Vehicle;

public  class Hero extends Vehicle {
	 @Override
    public String getModelName() {
        return "Hero Splendor";
    }

    @Override
    public String getRegistrationNumber() {
        return "TS09AB1234";
    }

    @Override
    public String getOwnerName() {
        return "Ravi Kumar";
    }

    public int getSpeed() {
        return 80;
    }

    public void radio() {
        System.out.println("Radio is ON in Hero bike.");

}
    }
