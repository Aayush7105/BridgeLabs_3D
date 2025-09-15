public class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;
    private double insuranceAmount;

    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber, double insuranceAmount) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
        this.insuranceAmount = insuranceAmount;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.1; // Trucks have an extra cost factor
    }

    @Override
    public double calculateInsurance() {
        return insuranceAmount;
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy Number: " + insurancePolicyNumber + ", Amount: " + insuranceAmount;
    }
}
