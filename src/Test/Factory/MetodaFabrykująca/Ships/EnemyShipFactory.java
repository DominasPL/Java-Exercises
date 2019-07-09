package Test.Factory.MetodaFabrykująca.Ships;

public class EnemyShipFactory {

    public EnemyShip makeEnemyShip(String type) {

        EnemyShip enemyShip = null;

        if (type.equals("U")) {
            enemyShip = new UFOEnemyShip();

        } else if (type.equals("SU")) {
            enemyShip = new SmallUFOEnemyShip();

        } else if (type.equals("R")) {
            enemyShip = new RocketEnemyShip();
        }

        return enemyShip;

    }


}
