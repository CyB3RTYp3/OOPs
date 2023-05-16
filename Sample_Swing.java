import javax.swing.*;
import java.awt.*;

public class Sample_Swing extends JFrame{
    example()
    {
        setTitle("Java Swing");
        setLayout(new FlowLayout());
        JTextField t1=new JTextField(20);
        add(t1);
        JButton b1=new JButton("Ys");
        add(b1);
        JButton b2=new JButton("no");
        add(b2);
        JTextField t2=new JTextField(20);
        add(t2);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    public static void main(String[] args) {
        new example();
    }
}
