
import java.awt.*;

public class f2 {
    f2(){
        Frame f = new Frame();
        Label l = new Label("welcome to my space");
        l.setBounds(30, 100, 200, 30);
        f.add(l);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }
    public static void main(String[] args){
        new f2();
    }
}
