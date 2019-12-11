package Sec7;

public class DeluxeHamburguer extends Hamburguer {

    public DeluxeHamburguer(double basePrice, String name, String breadRollType, String meat) {
        super(basePrice, name, breadRollType, meat);
        this.maxAdditionalItem = 2;
        AdditionalItem chipps = new AdditionalItem("Chipps", 5);
        AdditionalItem drink = new AdditionalItem("Drink", 4.5);
        this.addItem(chipps);
        this.addItem(drink);
    }
}
