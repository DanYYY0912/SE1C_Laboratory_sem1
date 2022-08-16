public class AStudent {
    private String name;
    private int age;
    
    public void setName(String inName) {
        name = inName;
    }
    
    public String getName() {
        return name;
    }
    
    public void setAge(int Age) {
        if(Age < 0) {
            System.out.println("The age input is invalid.");
            age = 18;
        }else
            age = Age;
    }
    
    public int getAge()
    {
        return age;
    }
}
