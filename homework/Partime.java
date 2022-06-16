import java.util.Calendar;

public class Partime extends Staff{
    public Partime() {
        super();
    }

    public Partime(String lastname,
                   String firstname,
                   String id,
                   char sex,
                   Calendar dob,
                   double hourlyRate,
                   int hoursWeek) {
        super(lastname, firstname, id, sex, dob, hourlyRate);
        this.hoursOfWeek = hoursWeek;
    }

    private  int hoursOfWeek;

    public int getHoursOfWeek() {
        return hoursOfWeek;
    }

    public void setHoursOfWeek(int hoursOfWeek) {
        this.hoursOfWeek = hoursOfWeek;
    }

    @Override
    public double monthlyEarning() {
        return getHourlyRate() * hoursOfWeek;
    }

    @Override
    public String toString(){
        return String.format("ID Employee number: %s\nEmployee name: %s %s\nBirth date: %s\nHours works per month:%d\nMonthly Salary:%f\n",
                getId(),
                getFirstName(),
                getLastName(),
                getDob().getTime().toString(),
                hoursOfWeek,
                monthlyEarning());
    }
}
