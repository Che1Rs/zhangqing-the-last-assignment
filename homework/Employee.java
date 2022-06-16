import java.util.Calendar;

/*
    Employee's basic information
 */
public abstract class Employee implements EmployeeInfo, Comparable<Employee> {
    public Employee(){}
    public Employee(String lastName, String firstName, String id, char sex, Calendar birth){
        this.lastName = lastName;
        this.firstName = firstName;
        this.id = id;
        this.sex = sex;
        this.dob = birth;
    }
    
    private String lastName;
    private String firstName;
    private String id;
    private char sex;
    private Calendar dob;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastname) {
        this.lastName = lastname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public Calendar getDob() {
        return dob;
    }

    public void setDob(Calendar birth_date) {
        this.dob = birth_date;
    }

    public  abstract  double monthlyEarning();

    @Override
    public String toString(){
        return String.format("ID Employee number: %s\nEmployee name: %s %s\nBirth date: %s\n",
                id,
                firstName,
                lastName,
                dob.getTime().toString());
    }

    /*
        Order Employee by id descending
     */
    @Override
    public int compareTo(Employee o) {
        return -id.compareTo(o.getId());
    }
}
