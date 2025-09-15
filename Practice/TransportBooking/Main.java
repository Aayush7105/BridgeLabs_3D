
public class Main {
    public static void main(String[] args) {
        Vehicle bike = new Bike();
        Vehicle car = new Car();
        Vehicle auto = new Auto();
        FareCalculator calculator = new SimpleFareCalculator();

        double distance = 12; // km

        System.out.println("Bike Fare: " + bike.calculateFare(distance, calculator));
        System.out.println("Car Fare: " + car.calculateFare(distance, calculator));
        System.out.println("Auto Fare: " + auto.calculateFare(distance, calculator));
    }
}
