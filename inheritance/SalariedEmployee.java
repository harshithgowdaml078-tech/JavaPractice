package inheritance;

public class SalariedEmployee extends Employee {
    double AnnualSalary;
     boolean isretired;

    public SalariedEmployee(String name, String birthdate, String hiredate, double AnnualSalary) {
        super(name, birthdate, hiredate);
        this.AnnualSalary = AnnualSalary;
    }

    @Override
    public double collectpay() {
        double paycheck = AnnualSalary / 26;
        double pensionpay = (isretired) ? 0.9 * paycheck : paycheck;
        return (int) pensionpay;
    }

   public void retire() {
        terminate("12/12/2025");
        isretired = true;
    }
}
