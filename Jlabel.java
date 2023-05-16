import javax.swing.*;

public class Jlabel{
    public static void main(String[] args) {
        JFrame labe=new JFrame("hellow Guys");
        JLabel str=new JLabel("studytonight ==> Label demo");
        JLabel s=new JLabel("Stop Studing");
        str.setBounds(50,50,200,30);
        s.setBounds(50,100,200,30);
        labe.add(s);
        labe.add(str);
        labe.setSize(300,300);
        labe.setLayout(null);
        labe.setVisible(true);

    }
    
}
