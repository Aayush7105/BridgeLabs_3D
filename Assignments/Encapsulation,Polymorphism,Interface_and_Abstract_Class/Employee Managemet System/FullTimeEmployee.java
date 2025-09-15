public class FullTimeEmployee extends Employee implements Department {
    private String department;
    private double bonus;

    public FullTimeEmployee(int employeeId, String name, double baseSalary, double bonus) {
        super(employeeId, name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
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
        System.out.println("Bonus: " + bonus);
        System.out.println("----------------------------");
    }
}
