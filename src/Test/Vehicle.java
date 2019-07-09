package Test;

public abstract class Vehicle {

    private String registrationNumber;
    private String vinNumber;
    private String color;
    private Long price;
    private Double combustion;
    private Double conditionOfTheFuelTank;
    private Long kmCounter;
    protected String lol;

    public Vehicle(String registrationNumber, String vinNumber, String color, Long price, Double combustion, Double conditionOfTheFuelTank, Long kmCounter, String lol) {
        this.registrationNumber = registrationNumber;
        this.vinNumber = vinNumber;
        this.color = color;
        this.price = price;
        this.combustion = combustion;
        this.conditionOfTheFuelTank = conditionOfTheFuelTank;
        this.kmCounter = kmCounter;
        this.lol = lol;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Double getCombustion() {
        return combustion;
    }

    public void setCombustion(Double combustion) {
        this.combustion = combustion;
    }

    public Double getConditionOfTheFuelTank() {
        return conditionOfTheFuelTank;
    }

    public void setConditionOfTheFuelTank(Double conditionOfTheFuelTank) {
        this.conditionOfTheFuelTank = conditionOfTheFuelTank;
    }

    public Long getKmCounter() {
        return kmCounter;
    }

    public void setKmCounter(Long kmCounter) {
        this.kmCounter = kmCounter;
    }

    public abstract void refuel();

    public abstract void drive(Long km);

}
