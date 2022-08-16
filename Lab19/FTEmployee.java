public class FTEmployee extends Employee{
    private double salary;
    public FTEmployee(String name, int employeeID, double salary){
        super(name,employeeID);
        this.salary = salary;
    }
	
    public String toString(){
        return super.toString() + ", Salary: " + salary;
    }
}

