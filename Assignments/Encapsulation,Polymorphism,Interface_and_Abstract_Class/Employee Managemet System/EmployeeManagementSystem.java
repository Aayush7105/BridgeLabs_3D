import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        FullTimeEmployee ftEmp = new FullTimeEmployee(1, "Alice", 50000, 10000);
        ftEmp.assignDepartment("HR");

        PartTimeEmployee ptEmp = new PartTimeEmployee(2, "Bob", 0, 500, 80);
        ptEmp.assignDepartment("Support");

        employees.add(ftEmp);
        employees.add(ptEmp);
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
