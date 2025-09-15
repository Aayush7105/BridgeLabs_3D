
public class Car extends Vehicle {
    public Car() {
        super(60, 20);
    }

    @Override
    public double calculateFare(double distance, FareCalculator calculator) {
        double fare = baseFare + distance * 10;
        return calculator.dynamicFare(fare, distance);
    }
}
