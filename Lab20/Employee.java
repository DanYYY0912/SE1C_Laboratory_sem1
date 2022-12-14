public class Employee {
    String name;
    int employeeID;
    protected int salary;
    
    public Employee(String name, int employeeID) {
        this.name = name;
        this.employeeID = employeeID;
    }

    public Employee(String name, int employeeID, int salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public String toString() {
        return "Name: " + name + ", Employee ID: "
                         + employeeID + ", Salary: " + salary;
    }
}
