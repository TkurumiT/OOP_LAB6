import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        StudentManager studentManager = new StudentManager();

        SwingUtilities.invokeLater(() -> {
            MainFrame mainFrame = new MainFrame(studentManager);
            mainFrame.setVisible(true);
        });
    }
}
