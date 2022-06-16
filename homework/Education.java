public class Education {
    public  Education(){

    }

    public Education(String degree, String major, int researchNumber) {
        this.degree = degree;
        this.major = major;
        this.researchNumber = researchNumber;
    }

    private String degree;
    private String major;
    private int researchNumber;

    public int getResearchNumber() {
        return researchNumber;
    }

    public void setResearchNumber(int researchNumber) {
        this.researchNumber = researchNumber;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
