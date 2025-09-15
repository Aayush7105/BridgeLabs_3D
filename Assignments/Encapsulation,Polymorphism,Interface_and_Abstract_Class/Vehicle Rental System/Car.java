public class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;
    private double insuranceAmount;

    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber, double insuranceAmount) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
        this.insuranceAmount = insuranceAmount;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
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
