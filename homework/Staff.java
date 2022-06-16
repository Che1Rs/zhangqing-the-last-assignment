import java.util.Calendar;

public class Staff extends Employee {
    public Staff(){ 
        super();
    }
    public Staff(String lastname, 
                 String firstname, 
                 String id, 
                 char sex, 
                 Calendar dob,
                 double hourlyRate){
        super(lastname, firstname, id, sex, dob);
        this.hourlyRate = hourlyRate;
    }
    private double hourlyRate;

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double monthlyEarning() {
        return hourlyRate * STAFF_MONTHLY_HOURS_WORKED;
    }

    @Override
    public String toString(){
        return super.toString() + String.format("Full Time Monthly Salary: %f\n", monthlyEarning());
    }
}
