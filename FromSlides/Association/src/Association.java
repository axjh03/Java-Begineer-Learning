class Department {
    private String departmentName;

    public Department(String name) {
        departmentName = name;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}

class Employee {
    private String employeeName;
    private Department department;  // Aggregation

    public Employee(String name, Department dept) {
        employeeName = name;
        department = dept;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public Department getDepartment() {
        return department;
    }
}

public class Association {
    public static void main(String[] args) {
        // Create Department objects
        Department hrDepartment = new Department("HR");
        Department itDepartment = new Department("IT");

        // Create Employee objects associated with departments
        Employee employee1 = new Employee("Alice", hrDepartment);
        Employee employee2 = new Employee("Bob", itDepartment);

        // Access and print employee and department information
        System.out.println(employee1.getEmployeeName() + " works in " + employee1.getDepartment().getDepartmentName());
        System.out.println(employee2.getEmployeeName() + " works in " + employee2.getDepartment().getDepartmentName());
    }
}
