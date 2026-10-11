
import javax.swing.*;

public class all {
    all() {
        JFrame f = new JFrame("Swing Components");
        f.setSize(400, 400);
        f.setLayout(null);

        // Checkbox
        JCheckBox cb = new JCheckBox("I agree");
        JCheckBox w = new JCheckBox("I dont agree");

        cb.setBounds(50, 50, 150, 30);
        w.setBounds(210, 50, 150, 30);

        f.add(cb);
        f.add(w);


        // Combo Box
        String courses[] = {"Java", "Python", "C++", "JavaScript"};
        JComboBox<String> c = new JComboBox<>(courses);
        c.setBounds(50, 110, 150, 30);
        f.add(c);

        // Radio Buttons
        JRadioButton r1 = new JRadioButton("Male");
        JRadioButton r2 = new JRadioButton("Female");

        r1.setBounds(50, 170, 100, 30);
        r2.setBounds(50, 210, 100, 30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        f.add(r1);
        f.add(r2);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new all();
    }
}
