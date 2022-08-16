public class PartTimer extends Employee{
    protected int workingHour;
    protected int hourlyRate;
    
    public PartTimer(String name, int employeeID, int workingHour,int hourlyRate){
        super(name,employeeID);
        this.workingHour = workingHour;
        this.hourlyRate = hourlyRate;
        setPartTimeWorkingHour(workingHour); 
        calculateSalary();
    }
    
    public int calculateSalary(){
        return salary = workingHour * hourlyRate;
    }
    
    public void setPartTimeWorkingHour(int workingHour){
        if (workingHour > 220){
            this.workingHour = 0;
        }
    }
    
    public String toString() {
        return super.toString() + ", Wroking Hour: " + workingHour + ", Hourly Rate:" + hourlyRate;
    }
}