public class Employee {

    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(String employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;

    }
    public void setHoursWorked(double hoursWorked){
        this.hoursWorked = hoursWorked;
    }
    public double getRegularHours() {
        return Math.min(hoursWorked,40.0);
    }
    public double getOverTimeHours(){
        return Math.max(0.0, hoursWorked - 40.0);
    }
    public double getTotalPay(){
        double regularPay = getRegularHours() * payRate;
        double overtimePay = getOverTimeHours() *(payRate * 1.5);
        return regularPay + overtimePay;
    }
}
