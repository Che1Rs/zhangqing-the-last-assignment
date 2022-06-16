import java.util.Calendar;

public class Faculty extends Employee implements Cloneable {
    public  Faculty() {
        super();
    }

    public Faculty(String lastname,
                   String firstname,
                   String id,
                   char sex,
                   Calendar dob,
                   FacultyLeve level,
                   Education education) {
        super(lastname, firstname, id, sex, dob);
        this.level = level;
        this.education = education;
    }

    private FacultyLeve level;
    private Education education;

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public FacultyLeve getLevel() {
        return level;
    }

    public void setLevel(FacultyLeve level) {
        this.level = level;
    }

    @Override
    public double monthlyEarning() {
        switch (level){
            case AS:
                return FACULTY_MONTHLY_SALARY;
            case AO:
                return 1.2 * FACULTY_MONTHLY_SALARY;
            case FU:
                return 1.4 * FACULTY_MONTHLY_SALARY;
            default:
                return 0;
        }
    }

    @Override
    public String toString(){
        String prefix;
        if(level == FacultyLeve.AS)
                prefix = "Assistant";
        else if(level == FacultyLeve.AO)
                prefix = "Associate";
        else
                prefix = "Full";
        return super.toString() + String.format("%s Professor\nMonthly Salary:%f\n",prefix, monthlyEarning());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        Faculty faculty = (Faculty) super.clone();
        faculty.setEducation(new Education(education.getDegree(),education.getMajor(),education.getResearchNumber()));
        return faculty;
    }

    public Object duplicate(){
        try{
            return clone();
        }catch (Exception e){
            return null;
        }
    }
}
