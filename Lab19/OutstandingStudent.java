public class OutstandingStudent extends Student{
    private String award;
    public OutstandingStudent(String name, int stid, int year, String award){
        super(name,stid,year);
        this.award = award;
    }
	
    public String toString()
    {
        return super.toString()+", Award: " + award;
    }
}
