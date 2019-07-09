package Test.Factory.MetodaFabrykująca.Ships;

public abstract class EnemyShip {

    private String name;
    private double damage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public void displayEnemyShip() {
        System.out.println(name + " is coming!");
    }

    public void enemyShipShoots() {
        System.out.println(name + " is attacking hero and giving " + damage + " damage!");
    }



}
