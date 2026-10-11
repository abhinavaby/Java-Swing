import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class gui5 {

    gui5() {
        JFrame f = new JFrame("My new Frame title");
        f.setSize(1350, 1150);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Progress Bar
        JProgressBar progress = new JProgressBar(0, 100);
        progress.setValue(20);
        progress.setStringPainted(true);
        progress.setBounds(35, 50, 285, 53);
        f.add(progress);

        // Button
        JButton b = new JButton("My press me Button");
        b.setBounds(105, 120, 265, 72);
        f.add(b);

        // Combo Box
        String courses[] = {
                "core java", "Advanced Java", "Python", "C++"
        };

        JComboBox<String> combo = new JComboBox<>(courses);
        combo.setBounds(445, 102, 160, 36);
        f.add(combo);

        // Password Field
        JPasswordField password = new JPasswordField();
        password.setBounds(550, 147, 175, 52);
        f.add(password);

        // Label
        JLabel label = new JLabel("My Label");
        label.setBounds(50, 210, 120, 35);
        f.add(label);

        // Text Field
        JTextField text = new JTextField("My Text Field");
        text.setBounds(425, 208, 175, 70);
        f.add(text);

        // Checkboxes
        JCheckBox cb1 = new JCheckBox("My Checkbox1");
        cb1.setBounds(55, 420, 200, 35);
        f.add(cb1);

        JCheckBox cb2 = new JCheckBox("My Checkbox2");
        cb2.setBounds(55, 475, 200, 35);
        cb2.setSelected(true);
        f.add(cb2);

        // Radio Buttons
        JRadioButton r1 = new JRadioButton("Male");
        JRadioButton r2 = new JRadioButton("Female");

        r1.setBounds(80, 545, 120, 35);
        r2.setBounds(80, 585, 120, 35);

        ButtonGroup group = new ButtonGroup();
        group.add(r1);
        group.add(r2);

        f.add(r1);
        f.add(r2);

        // Slider
        JSlider slider = new JSlider(0, 100, 50);
        slider.setBounds(75, 640, 180, 50);
        f.add(slider);

        // Text Area
        JTextArea area = new JTextArea("My Text Area");
        area.setLineWrap(true);
        area.setWrapStyleWord(true);

        JScrollPane textScroll = new JScrollPane(area);
        textScroll.setBounds(460, 315, 355, 355);
        f.add(textScroll);

        // Scroll Bar
        JScrollBar scrollBar = new JScrollBar(
                JScrollBar.VERTICAL, 0, 10, 0, 100
        );
        scrollBar.setBounds(320, 300, 85, 175);
        f.add(scrollBar);

        // Tabbed Pane
        JTabbedPane tabs = new JTabbedPane();

        JPanel mainPanel = new JPanel();
        JPanel visitPanel = new JPanel();
        JPanel helpPanel = new JPanel();

        tabs.addTab("main", mainPanel);
        tabs.addTab("visit", visitPanel);
        tabs.addTab("help", helpPanel);

        tabs.setBounds(105, 745, 355, 355);
        f.add(tabs);

        // Table
        String columns[] = {"ID", "NAME", "SALARY"};

        Object data[][] = {
                {"101", "Amit", "670000"},
                {"102", "Jai", "780000"},
                {"101", "Sachin", "700000"}
        };

        JTable table = new JTable(
                new DefaultTableModel(data, columns)
        );

        JScrollPane tableScroll = new JScrollPane(table);
        tableScroll.setBounds(640, 740, 355, 355);
        f.add(tableScroll);

        // Tree
        DefaultMutableTreeNode style =
                new DefaultMutableTreeNode("Style");

        DefaultMutableTreeNode color =
                new DefaultMutableTreeNode("color");

        DefaultMutableTreeNode font =
                new DefaultMutableTreeNode("font");

        style.add(color);
        style.add(font);

        JTree tree = new JTree(style);

        JScrollPane treeScroll = new JScrollPane(tree);
        treeScroll.setBounds(1030, 755, 295, 345);
        f.add(treeScroll);

        // Display Frame
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new gui5();
    }
}