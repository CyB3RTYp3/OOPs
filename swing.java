import javax.swing.*;
public class swing extends JFrame
{
    public swing()
    {
        setTitle("Simple Example");
        setSize(1080,720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        swing ex=new swing();
        ex.setVisible(true);
        
    }
}