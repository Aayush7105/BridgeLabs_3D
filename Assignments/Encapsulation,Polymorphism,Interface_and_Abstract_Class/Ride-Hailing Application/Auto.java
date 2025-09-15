public class Auto extends Vehicle implements GPS {
    private String location;

    public Auto(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm);
        this.location = location;
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance * 1.1; // Autos have a surcharge
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }
}
