
public class Auto extends Vehicle {
    public Auto() {
        super(50, 15);
    }

    @Override
    public double calculateFare(double distance, FareCalculator calculator) {
        double fare = baseFare + distance * 7;
        return calculator.dynamicFare(fare, distance);
    }
}
