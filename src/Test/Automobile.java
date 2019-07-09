package Test;

public class Automobile extends Vehicle {

    private int numberOfDoors;

    public Automobile(String registrationNumber, String vinNumber, String color, Long price, Double combustion, Double conditionOfTheFuelTank, Long kmCounter, String lol, int numberOfDoors) {
        super(registrationNumber, vinNumber, color, price, combustion, conditionOfTheFuelTank, kmCounter, lol);
        this.numberOfDoors = numberOfDoors;
    }

    public void changeLol() {}

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void refuel() {
        setConditionOfTheFuelTank(40d);
    }

    @Override
    public void drive(Long km) {
        Long kmCounter = getKmCounter();
        setKmCounter(kmCounter + km);
        Double conditionOfTheFuelTank = getConditionOfTheFuelTank();
        setConditionOfTheFuelTank(conditionOfTheFuelTank - ((getCombustion()/100) * km));
    }
}
