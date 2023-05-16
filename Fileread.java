import java.io.*;
import java.io.IOException;

public class Fileread {
    public static void main(String args[]) throws IOException
    {
        FileInputStream file=new FileInputStream("name.txt");
        FileOutputStream f=new FileOutputStream("read.txt");
        int i=0;
        System.out.print(++i+":");
        while(file.available()!=0)
        {
            char ch=(char)file.read();
            System.out.print(ch);
            f.write((char)ch);
            if(ch=='\n')
            {
                System.out.print(++i+":");
                f.write((int)i);
            }
        }
        file.close();
        f.close();
    }
    
}
