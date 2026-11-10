public class Employee {

    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    //when shift was started
    private int startTime;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }
    //start time
    public void punchIn(int time){
        this.startTime = time;
    }
    //
    public void punchOut(int time){
        int hoursThisShift = time - this.startTime;
        this.hoursWorked +=  hoursThisShift;
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
