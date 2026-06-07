package inheritance;

public class Employee extends WorkerChallenge {
    private long employeeID;
    private String hiredate;

    private static int employeeno = 1;

   public Employee(String name, String birthdate, String hiredate) {
       super(name,birthdate);
       this.employeeID = Employee.employeeno++;
       this.hiredate = hiredate;
   }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", hiredate='" + hiredate + '\'' +
                ", employeeno=" + employeeno +
                "} " + super.toString();
    }
}
