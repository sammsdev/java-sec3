package com.sam_sec6;

public class Outlander extends  Car {

    private int roadServiceMonths;

    public Outlander() {
        super("Outlander", "4WD", 5, 5, 5, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate (int rate) {
        int newVelocity = getCurrentVelocity() + rate;

        changeVelocity(newVelocity, getCurrentDirection());
        //changeGear... no need to implement
    }



}
