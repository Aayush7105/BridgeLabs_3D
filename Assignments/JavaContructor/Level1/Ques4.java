class Employee {
    public String employeeID;
    protected String department;
    private double salary;

    public Employee(String employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {

    public Manager(String employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void displayManagerInfo() {
        System.out.println("Employee ID: " + employeeID);  
        System.out.println("Department: " + department);   
        System.out.println("Salary: $" + getSalary());    
    }
}

public class Ques4 {
    public static void main(String[] args) {
        Manager manager = new Manager("EMP2001", "Finance", 85000.00);
        manager.displayManagerInfo();

        System.out.println();
        manager.setSalary(90000.00);
        System.out.println("After salary update:");
        manager.displayManagerInfo();
    }
}
