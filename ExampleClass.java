package main.main.Program;

public class ExampleClass {
    public String empName;
    String emailAddress;
    private int empId;
    protected int empAge;

    ExampleClass(String eName, String eAddress)
    {
        empName = eName;
        emailAddress = eAddress;
    }

    public void setEmpinformation(int eId, int eAge)
    {
        empId = eId;
        empAge = eAge;
    }

    public void showinformation()
    {
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Email Address: " + emailAddress);
        System.out.println("Employee Id: " + empId);
        System.out.println("Employee Age: " + empAge);
    }

    public static void main(String args[])
    {
        ExampleClass exObj = new ExampleClass("Adithya", "AdithyaSrinivas66@gmail.com");
        exObj.setEmpinformation(12, 23);
        exObj.showinformation();
    }
}

