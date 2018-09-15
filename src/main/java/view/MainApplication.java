package view;

import javax.swing.JFrame;

public class MainApplication extends JFrame {
    public MainApplication() {
        super("Calendar/Reminders Application");

        initialiseFrame();
    }

    public void initialiseFrame() {
        // Application Settings
        pack();
        setVisible(true);
        setSize(600, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}