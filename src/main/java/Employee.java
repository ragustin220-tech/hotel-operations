import java.time.LocalDateTime;

public class Employee {

    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    //when shift was started
    private double startTime = -1;

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
        if (this.startTime != -1){
            double elapsedHours = time - this.startTime;
            this.hoursWorked += elapsedHours;
            this.startTime = -1;
        }
//        int hoursThisShift = time - this.startTime;
//        this.hoursWorked +=  hoursThisShift;
    }

    public void punchIn(){
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        int minute = now.getMinute();
        this.startTime = hour + (minute /60.0);
    }

    public void punchOut(){
        if (this.startTime != -1) {
            LocalDateTime now = LocalDateTime.now();
            int hour = now.getHour();
            int minute = now.getMinute();

            double endTIme = hour + (minute / 60.0);
            double elapsedHours = endTIme - this.startTime;

            this.hoursWorked += elapsedHours;
            this.startTime = -1;
        }
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
