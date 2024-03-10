import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> listStudents;

    public StudentManager() {
        this.listStudents = new ArrayList<>();
    }

    public Student findStudentById(String studentID) {
        for (Student student : listStudents) {
            if (student.getStudentID().equals(studentID)) {
                return student;
            }
        }
        return null; // Student with specified ID not found
    }

    public boolean addStudent(Student student) {
        if (findStudentById(student.getStudentID()) != null) {
            return false; // Student with the same ID already exists
        }

        listStudents.add(student);
        return true; // Student added successfully
    }

    public ArrayList<Student> getListStudents() {
        return new ArrayList<>(listStudents); 
    }
}
