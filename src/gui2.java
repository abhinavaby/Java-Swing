
import javax.swing.*;

public class gui2 {
    gui2() {
        JFrame jf = new JFrame("button EXAMPLE");

        JPanel jp = new JPanel();

        JTextField t1 = new JTextField("hello", 30);
        JButton b1 = new JButton("Click Me");

        jp.setBounds(100, 100, 250, 150);
        jp.setLayout(null);

        t1.setBounds(10, 10, 150, 30);
        b1.setBounds(70, 120, 120, 30);

        jp.add(t1);
        jp.add(b1);

        jf.add(jp);

        jf.setSize(400, 400);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new gui2();
    }
}