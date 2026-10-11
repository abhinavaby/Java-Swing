
import javax.swing.*;
public class j {
    j(){
        JFrame jf = new JFrame("button EXAMPLE");
        JButton b = new JButton("Click Me");
        b.setBounds(100,100,100,100);
        jf.add(b);
        jf.setSize(400,400);
        jf.setLayout(null);
        jf.setVisible(true);
    }
    public static void main(String[] args) {
        new j();
    }
}
