import javax.swing.*;
public class gui {
    gui(){
        JFrame f = new JFrame("button EXAMPLE");
        JPanel p = new JPanel();
        p.setBounds(100,100,100,100);
        JButton b = new JButton("Click Me");
        b.setBounds(100,100,100,100);
        p.add(b);
        f.add(p);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);


    }
    public static void main(String[] args) {
        new gui();
    }
}
