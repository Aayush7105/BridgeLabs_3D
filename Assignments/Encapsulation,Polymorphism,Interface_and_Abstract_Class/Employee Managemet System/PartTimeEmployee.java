public class PartTimeEmployee extends Employee implements Department {
    private String department;
    private double hourlyRate;
    private int workHours;

    public PartTimeEmployee(int employeeId, String name, double baseSalary, double hourlyRate, int workHours) {
        super(employeeId, name, baseSalary);
        this.hourlyRate = hourlyRate;
        this.workHours = workHours;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * workHours;
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(getDepartmentDetails());
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Work Hours: " + workHours);
        System.out.println("----------------------------");
    }
}
