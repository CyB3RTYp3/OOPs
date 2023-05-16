import java.io.*;

import java.io.IOException;
class File{
    public static void main(String[] args) throws IOException{
        FileInputStream f1=new FileInputStream("read.txt");
        int i=0;
        System.out.print(++i+": ");
        while(f1.available()!=0)
        {
            char ch=(char)f1.read();
            System.out.print(ch);
            if(ch=='\n')
              System.out.print(++i+": ");
            
        }
        f1.close();



        
    }
}