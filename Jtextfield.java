import javax.swing.*;
import java.awt.*;
public class Jtextfield extends JFrame
{
    jtextfield()
    {
        JTextField str=new JTextField(10);
        add(str);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,400);
        setVisible(true);
    }
    public static void main(String[] args) {
        new jtextfield();
    }
}