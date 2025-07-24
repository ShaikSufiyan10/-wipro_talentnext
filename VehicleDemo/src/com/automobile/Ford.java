package com.automobile;

import com.automobile.Vehicle;
public class Ford extends Vehicle {
    public String getModelName() {
        return "Ford Figo";
    }

    public String getRegistrationNumber() {
        return "TS09XY9876";
    }

    public String getOwnerName() {
        return "Azhar";
    }

    public int speed() {
        return 140;
    }

    public int tempControl() {
        return 1; // 1 = AC On
    }
}
