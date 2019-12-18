package com.sam_sec7;

public class Hamburguer {

    private double basePrice;
    private double totalPrice;
    private String name;
    private String roolType;
    private String meat;
    protected int maxAdditionalItem;
    private int currentAdditionItem;
    private String additionals = "";

    public Hamburguer(double basePrice, String name, String breadRollType, String meat) {
        this.basePrice = basePrice;
        this.totalPrice = basePrice;
        this.name = name;
        this.roolType = breadRollType;
        this.meat = meat;
        this.maxAdditionalItem = 4;
        this.currentAdditionItem = 0;
    }

    public void addItem(AdditionalItem item){
        if(this.getCurrentAdditionItem() < this.getMaxAdditionalItem()){
            this.setTotalPrice(item.getPrice());
            this.additionals += "Additional #" + (this.currentAdditionItem+1) + " - " + item.getName() + " Price = " + item.getPrice() +"\n";
            this.currentAdditionItem++;
        }
    }

    public void setTotalPrice(double itemPrice) {
        this.totalPrice += itemPrice;
    }
    public double getTotalPrice () {
        return this.totalPrice;
    }

    public int getMaxAdditionalItem() {
        return maxAdditionalItem;
    }

    public int getCurrentAdditionItem() {
        return currentAdditionItem;
    }

    public String getAdditionals () {
        return additionals;
    }

}
