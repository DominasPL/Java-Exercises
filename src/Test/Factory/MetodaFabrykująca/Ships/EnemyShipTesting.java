package Test.Factory.MetodaFabrykująca.Ships;

import java.util.Scanner;

public class EnemyShipTesting {

    public static void main(String[] args) {

        EnemyShipFactory enemyShipFactory = new EnemyShipFactory();

        Scanner scanner = new Scanner(System.in);

        String kindOfShip = "";

        System.out.println("What kind of ship? (U / R / SU)");

        if (scanner.hasNextLine()) {
            kindOfShip = scanner.nextLine();
        }

        EnemyShip enemyShip = enemyShipFactory.makeEnemyShip(kindOfShip);

        if (enemyShip != null) {

            doStuff(enemyShip);
        }


    }

    public static void doStuff(EnemyShip enemyShip) {
        enemyShip.displayEnemyShip();
        enemyShip.enemyShipShoots();

    }

}
