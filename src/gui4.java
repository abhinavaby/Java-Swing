
import javax.swing.*;

public class gui4 {
    gui4(){
        JFrame f =  new JFrame("password");
        JPanel p = new JPanel();
        p.setBounds(0,0,400,400);

        JPasswordField password = new JPasswordField(20);
        password.setBounds(10, 10, 200, 200);
        p.add(password);
        f.add(p);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }
    public static void main(String[] args) {
        new gui4();
    }



}
