
public class SimpleFareCalculator implements FareCalculator {
    @Override
    public double dynamicFare(double baseFare, double distance) {
        
        if (distance > 10) {
            return baseFare * 1.2;
        }
        return baseFare;
    }
}
