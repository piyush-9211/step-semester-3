package week3.OOPHomework.M5;

public class Employee {

    String empName;
    double salary;

    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    public Employee(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee("Aman", 50000);
        Employee e2 = new Employee("Priya", 55000);
        Employee e3 = new Employee("Rahul", 60000);

        Employee.printCompanyInfo();
    }
}
