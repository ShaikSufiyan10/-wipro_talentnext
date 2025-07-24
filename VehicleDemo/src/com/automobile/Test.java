package com.automobile;
public class Test {
    public static void main(String[] args) {
        Logan logan = new Logan();
        System.out.println("Logan Model: " + logan.getModelName());
        System.out.println("Speed: " + logan.speed() + " km/h");
        System.out.println("GPS Enabled: " + (logan.gps() == 1 ? "Yes" : "No"));

        System.out.println();

        Ford ford = new Ford();
        System.out.println("Ford Model: " + ford.getModelName());
        System.out.println("Speed: " + ford.speed() + " km/h");
        System.out.println("AC Enabled: " + (ford.tempControl() == 1 ? "Yes" : "No"));
    }
}