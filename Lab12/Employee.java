public class Employee
{
    private String name;
    private int salary;
    
    public Employee(String eName, int eSal)
    {
        name = eName;
        salary = eSal;
    }
    
    public void raiseSalary(double profitRate)
    {
        salary = (int)(salary * (1 + profitRate));
    }
    
    public void displayDetails()
    {
        System.out.println(": name = "+getName() +" salary = " +
                           getSalary());
    }
    
    public String getName()
    {
        return name;
    }
    
    public double getSalary() {
        return salary;
    }
}
