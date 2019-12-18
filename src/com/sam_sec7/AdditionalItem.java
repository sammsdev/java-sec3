package com.sam_sec7;

public class AdditionalItem {
    private String name;
    private double price;

    public AdditionalItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
