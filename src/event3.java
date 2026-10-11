import javax.swing.*;
import java.awt.event.*;

public class event3 implements ActionListener{
    JTextArea t1;
    JLabel l1;
    JLabel l2;


    event3(){
        JFrame f = new JFrame("word counter");
        JPanel p = new JPanel();
        t1 = new JTextArea();
        l1 = new JLabel("words: ");
        l2 = new JLabel("letters: ");
        JButton b1 = new JButton("count");
        b1.addActionListener(this);
        p.setSize(400,400);
        t1.setBounds(20,70,200,120);
        l1.setBounds(20,0,100,70);
        l2.setBounds(180,0,100,70);
        b1.setBounds(100,250,50,20);
        b1.addActionListener(this);
        p.add(t1);
        p.add(l1);
        p.add(l2);
        p.add(b1);
        p.setLayout(null);
        f.add(p);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        String s = t1.getText();
        l1.setText("words: " + s.length());
        l2.setText("letters: " + s.split(" ").length);

    }
    public static void main(String[] args){
        new event3();
    }
}
