import javax.swing.*;
import java.awt.event.*;

public class event1 implements ActionListener {
    JTextField t1;

    event1() {
        JFrame f = new JFrame("welcome");

        JPanel p = new JPanel();
        t1 = new JTextField("Enter your name");
        JButton b1 = new JButton("submit");

        // Set component positions
        t1.setBounds(10, 10, 120, 30);
        b1.setBounds(10, 60, 100, 30);

        // Add button action listener
        b1.addActionListener(this);

        // Set panel layout and add components
        p.setLayout(null);
        p.add(t1);
        p.add(b1);
        p.setBounds(30, 30, 300, 300);

        // Add panel to frame
        f.setLayout(null);
        f.add(p);

        f.setSize(400, 400);

        f.setVisible(true);
    }

    // Executes when the button is clicked
    public void actionPerformed(ActionEvent e) {
        t1.setText("wecome" + " " +t1.getText());
    }

    public static void main(String[] args) {
        new event1();
    }
}