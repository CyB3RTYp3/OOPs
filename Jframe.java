import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Jframe extends JFrame{
    frame()
    {   setSize(400,500);
        setTitle("Swing");
        setLayout(new FlowLayout());
        JLabel l1=new JLabel("Enter Your Number");
        add(l1);
        JTextField t1=new JTextField(20);
        add(t1);
        JLabel l2=new JLabel("prev");
        add(l2);
        JTextField t2=new JTextField(20);
        add(t2);
        t2.setEditable(false);
        JLabel l3=new JLabel("next");
        add(l3);
        JTextField t3=new JTextField(20);
        add(t3);
        t3.setEditable(false);
        JButton b1=new JButton("Go");
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                int input=Integer.parseInt(t1.getText());
                t2.setText(String.valueOf((input-1)));
                t3.setText(String.valueOf(input+1));
            }
        });
        add(b1);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        
    }
    public static void main(String[] args) {
        frame fr=new frame();
        fr.setVisible(true);
    }
    
}
