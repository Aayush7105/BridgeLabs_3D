import java.util.ArrayList;
import java.util.List;

public class RideHailingApp {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        Car car = new Car("C001", "John", 20, "Central Park");
        Bike bike = new Bike("B001", "Mike", 10, "Downtown");
        Auto auto = new Auto("A001", "Raj", 15, "Airport");

        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(auto);

        double distance = 12.5; // Distance for which fare is calculated

        for (Vehicle vehicle : vehicles) {
            vehicle.getVehicleDetails();
            System.out.println("Current Location: " + ((GPS) vehicle).getCurrentLocation());
            double fare = vehicle.calculateFare(distance);
            System.out.println("Fare for " + distance + " km: " + fare);
            System.out.println("----------------------------");
        }
    }
}
