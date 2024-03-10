import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private StudentManager studentManager;

    public MainFrame(StudentManager studentManager) {
        this.studentManager = studentManager;

        setTitle("Student Management System");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton newStudentButton = new JButton("New Student");
        JButton checkTotalButton = new JButton("Check Total Student");

        newStudentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openNewStudentDialog();
            }
        });

        checkTotalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showTotalStudents();
            }
        });

        JPanel panel = new JPanel();
        panel.add(newStudentButton);
        panel.add(checkTotalButton);

        add(panel);
    }

    private void openNewStudentDialog() {
        NewStudentDialog newStudentDialog = new NewStudentDialog(studentManager, this);
        newStudentDialog.setVisible(true);
    }

    private void showTotalStudents() {
        int totalStudents = studentManager.getListStudents().size();
        JOptionPane.showMessageDialog(this, "Total Students: " + totalStudents, "Total Students", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {

        StudentManager studentManager = new StudentManager();

        SwingUtilities.invokeLater(() -> {
            MainFrame mainFrame = new MainFrame(studentManager);
            mainFrame.setVisible(true);
        });
    }
}

