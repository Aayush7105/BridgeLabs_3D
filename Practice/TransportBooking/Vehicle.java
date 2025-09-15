
public abstract class Vehicle {
    protected double speed;
    protected double baseFare;

    public Vehicle(double speed, double baseFare) {
        this.speed = speed;
        this.baseFare = baseFare;
    }

    public abstract double calculateFare(double distance, FareCalculator calculator);
}
