
import java.awt.*;
public class awt extends Frame {
    awt(){
        Button b = new Button("Click Me");
        b.setBounds(30,100,80,30);
        add(b);
        setSize(500,500);
        setLayout(null);
        setVisible(true);

    }
    public static void main(String[] args) {
        new awt();
    }

}
