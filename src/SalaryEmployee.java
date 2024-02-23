
public class SalaryEmployee extends Employee {
    private double weeklySalary;


    public SalaryEmployee(String name, String jobTitle, double weeklySalary) {
        super(name, jobTitle);
        this.weeklySalary = weeklySalary;
    }


    @Override
    public double calculateWeeklyPay() {
        return weeklySalary;
    }
}
