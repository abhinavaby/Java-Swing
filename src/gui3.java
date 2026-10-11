import javax.swing.*;


public class gui3 {
    gui3(){
        JFrame jf = new JFrame();
        JPanel jp = new JPanel();
        jp.setBounds(3, 3, 150, 30);
        String chioce[] = {"apple","mango","orange","grapes"};
        JComboBox a = new JComboBox(chioce);
        a.setBounds(10, 10, 150, 30);
        jp.add(a);
        jf.add(jp);
        jf.setSize(300,300);
        jf.setLayout(null);
        jf.setVisible(true);
    }
    public   static void main(String[] args){
        new gui3();
    }
}
