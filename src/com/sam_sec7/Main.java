package com.sam_sec7;

public class Main {

    public static void main(String[] args) {
        AdditionalItem lettuce = new AdditionalItem("Lettuce", 2);
        AdditionalItem tomato = new AdditionalItem("Tomato", 3);
        AdditionalItem carrot = new AdditionalItem("Carrot", 1.5);
        AdditionalItem cheese = new AdditionalItem("Cheese", 3);
        AdditionalItem bacon = new AdditionalItem("Bacon", 3.5);
        AdditionalItem ketchup = new AdditionalItem("ketchup", 1);
        HealthyHamburguer heathyH = new HealthyHamburguer(25.00, "Vegan", "Chicken");
        System.out.println("Healthy Hamburguer before adding items - Price: " + heathyH.getTotalPrice());
        heathyH.addItem(lettuce);
        heathyH.addItem(tomato);
        heathyH.addItem(carrot);
        heathyH.addItem(bacon);
        heathyH.addItem(ketchup);
        heathyH.addItem(cheese);
        System.out.println(heathyH.getAdditionals());
        System.out.println("Healthy Hamburguer after adding items - Price: " + heathyH.getTotalPrice() + " Max Additional = " + heathyH.getMaxAdditionalItem() +"\n\n");
        Hamburguer baseBurguer = new Hamburguer(18.0, "Basic", "Italian", "Chicken");
        System.out.println("Basic Hamburguer before adding items - Price: " + baseBurguer.getTotalPrice());
        baseBurguer.addItem(lettuce);
        baseBurguer.addItem(tomato);
        baseBurguer.addItem(carrot);
        baseBurguer.addItem(cheese);
        System.out.println(baseBurguer.getAdditionals());
        System.out.println("Basic Hamburguer after adding items - Price: " + baseBurguer.getTotalPrice() + " Max Additional = " + baseBurguer.getMaxAdditionalItem() + "\n\n");
        DeluxeHamburguer deluxeHamburguer = new DeluxeHamburguer(20, "Deluxe", "Italian", "Meat");
        deluxeHamburguer.addItem(bacon);
        System.out.println("DeluxeHamburguer - Price: " + deluxeHamburguer.getTotalPrice());
        System.out.println(deluxeHamburguer.getAdditionals());

    }

}
