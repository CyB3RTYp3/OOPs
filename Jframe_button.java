import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Jframe_button extends JFrame{
    JLabel label;
    JButton yesButton;
    JButton nobButton;
    public button()
    {
        setTitle("ButttomFraem");
        setLayout(new FlowLayout());
        label=new JLabel();
        add(label);
         yesButton=new JButton("yes");
        yesButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                label.setText(((JButton)e.getSource()).getText());
            }});
         nobButton=new JButton("NO");
        nobButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                label.setText(((JButton)e.getSource()).getText());
    }});
        add(yesButton);
        add(nobButton);
        setSize(200 ,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    
    public static void main(String[] args) {
        button n1=new button();
        n1.setVisible(true);
    }
}
