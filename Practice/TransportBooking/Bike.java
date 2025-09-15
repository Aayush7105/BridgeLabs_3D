
public class Bike extends Vehicle {
    public Bike() {
        super(40, 10); // speed, baseFare
    }

    @Override
    public double calculateFare(double distance, FareCalculator calculator) {
        double fare = baseFare + distance * 5;
        return calculator.dynamicFare(fare, distance);
    }
}
