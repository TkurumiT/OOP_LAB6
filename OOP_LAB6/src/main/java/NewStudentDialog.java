import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewStudentDialog extends JDialog {
    private StudentManager studentManager;
    private MainFrame mainFrame;

    private JTextField idField, lastNameField, midNameField, firstNameField,
            birthYearField, genderField, schoolStageField;

    public NewStudentDialog(StudentManager studentManager, MainFrame mainFrame) {
        this.studentManager = studentManager;
        this.mainFrame = mainFrame;

        setTitle("New Student");
        setSize(400, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        idField = new JTextField(10);
        lastNameField = new JTextField(10);
        midNameField = new JTextField(10);
        firstNameField = new JTextField(10);
        birthYearField = new JTextField(10);
        genderField = new JTextField(10);
        schoolStageField = new JTextField(10);

        JButton addButton = new JButton("Add Student");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addStudent();
            }
        });

        panel.add(new JLabel("Student ID:"));
        panel.add(idField);
        panel.add(new JLabel("Last Name:"));
        panel.add(lastNameField);
        panel.add(new JLabel("Mid Name:"));
        panel.add(midNameField);
        panel.add(new JLabel("First Name:"));
        panel.add(firstNameField);
        panel.add(new JLabel("Birth Year:"));
        panel.add(birthYearField);
        panel.add(new JLabel("Gender:"));
        panel.add(genderField);
        panel.add(new JLabel("School Stage:"));
        panel.add(schoolStageField);
        panel.add(addButton);

        add(panel);
    }

    private void addStudent() {
        String studentID = idField.getText();
        String lastName = lastNameField.getText();
        String midName = midNameField.getText();
        String firstName = firstNameField.getText();
        int birthYear = Integer.parseInt(birthYearField.getText());
        String gender = genderField.getText();
        String schoolStage = schoolStageField.getText();

        // Check if the ID already exists
        if (studentManager.findStudentById(studentID) != null) {
            JOptionPane.showMessageDialog(this, "Error: Student ID already exists!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            Student student = new Student(studentID, lastName, midName, firstName, birthYear, gender, schoolStage);
            studentManager.addStudent(student);

            JOptionPane.showMessageDialog(this, "Student added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
     
            clearFields();
            dispose();
            
            mainFrame.repaint(); 
        }
    }

    private void clearFields() {
        idField.setText("");
        lastNameField.setText("");
        midNameField.setText("");
        firstNameField.setText("");
        birthYearField.setText("");
        genderField.setText("");
        schoolStageField.setText("");
    }
}
