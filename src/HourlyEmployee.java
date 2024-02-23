public class HourlyEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;


    public HourlyEmployee(String name, String jobTitle, double hourlyRate, int hoursWorked) {
        super(name, jobTitle);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }


    @Override
    public double calculateWeeklyPay() {
        return hourlyRate * hoursWorked;
    }
}
