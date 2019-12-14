package Sec9;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private int hitPoint;
    private int strenght;
    private String weapon;


    public Player(String name, int hitPoint, int strenght) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.strenght = strenght;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }


    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoint=" + hitPoint +
                ", strenght=" + strenght +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, getHitPoint() + "");
        values.add(2, getStrenght() + "");
        values.add(3, getWeapon());
        return values;
    }

    @Override
    public void read(List<String> saveValues) {
        if (saveValues.size() >= 0 && saveValues != null) {
            this.setName(saveValues.get(0));
            this.setHitPoint(Integer.parseInt(saveValues.get(1)));
            this.setStrenght(Integer.parseInt(saveValues.get(2)));
            this.setWeapon(saveValues.get(3));
        }
    }
}
