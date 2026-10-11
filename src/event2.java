import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class event2 implements ActionListener {
    JTextField t1;
    JTextField t2;
    JTextField t3;
    JButton b1;
    JButton b2;

    event2(){
        JFrame f = new JFrame("Calculator");
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(4,2));
        JLabel l1 = new JLabel("num 1");
        JLabel l2 = new JLabel("num 2");
        JLabel l3 = new JLabel("Result");
         t1 = new JTextField();
         t2 = new JTextField();
         t3 = new JTextField();
         b1 = new JButton("add");
         b2 = new JButton("sub");
         b1.addActionListener(this);
         b2.addActionListener(this);
        p.add(l1);
        p.add(t1);
        p.add(l2);
        p.add(t2);
        p.add(b1);
        p.add(b2);
        p.add(l3);
        p.add(t3);
        f.add(p);
        f.setSize(500,400);
        f.setVisible(true);

    }
    public void actionPerformed(ActionEvent e) {
        try{
            int c=0;
            String s1=t1.getText();
            String s2=t2.getText();
            int a=Integer.parseInt(s1);
            int b=Integer.parseInt(s2);
            if(e.getSource()==b1){
                c=a+b;
            }
            else if(e.getSource()==b2){
                c=a-b;
            }
            t3.setText(String.valueOf(c));
        }
        catch(Exception ex){
            t3.setText("Error");
        }

    }
    public static void main(String[] args) {
        new event2();
    }

}
