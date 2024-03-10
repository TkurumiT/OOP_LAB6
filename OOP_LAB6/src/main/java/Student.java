public class Student {
    private String studentID;
    private String lastName;
    private String midName;
    private String firstName;
    private int yearOfBirth;
    private String gender;
    private String schoolStage;

    public Student(String studentID, String lastName, String midName, String firstName,
                   int yearOfBirth, String gender, String schoolStage) {
        this.studentID = studentID;
        this.lastName = lastName;
        this.midName = midName;
        this.firstName = firstName;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.schoolStage = schoolStage;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMidName() {
        return midName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public String getSchoolStage() {
        return schoolStage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", lastName='" + lastName + '\'' +
                ", midName='" + midName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", gender='" + gender + '\'' +
                ", schoolStage='" + schoolStage + '\'' +
                '}';
    }
}
