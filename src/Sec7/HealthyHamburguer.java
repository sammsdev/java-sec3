package Sec7;

public class HealthyHamburguer extends  Hamburguer {

    public HealthyHamburguer(double basePrice, String name, String meat) {
        super(basePrice, name, "Brown Rye Bread", meat);
        this.maxAdditionalItem = 6;
    }
}
