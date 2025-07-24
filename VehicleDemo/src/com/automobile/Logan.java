package com.automobile;

import com.automobile.Vehicle;

public class Logan extends Vehicle {
    public String getModelName() {
        return "Logan Sedan";
    }

    public String getRegistrationNumber() {
        return "AP01AB1234";
    }

    public String getOwnerName() {
        return "Shaik Sufiyan";
    }

    public int speed() {
        return 120;
    }

    public int gps() {
        return 1; // 1 = GPS Enabled
    }
}
