import java.util.ArrayList;
import java.util.List;

public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("CAR123", 1500, "INS123", 5000));
        vehicles.add(new Bike("BIKE456", 500));
        vehicles.add(new Truck("TRUCK789", 3000, "INS789", 10000));

        int rentalDays = 3;

        for (Vehicle vehicle : vehicles) {
            vehicle.displayVehicle();
            double rentalCost = vehicle.calculateRentalCost(rentalDays);
            System.out.println("Rental Cost for " + rentalDays + " days: " + rentalCost);

            if (vehicle instanceof Insurable) {
                Insurable insurable = (Insurable) vehicle;
                System.out.println(insurable.getInsuranceDetails());
                System.out.println("Insurance Cost: " + insurable.calculateInsurance());
            } else {
                System.out.println("No insurance applicable.");
            }

            System.out.println("----------------------------");
        }
    }
}
