import java.io.*;
import java.io.IOException;
import java.util.*;

public class tokenizer {
    public static void main(String args[]) throws IOException
    {
        FileInputStream file =new FileInputStream("number.txt");
        int i=0,sum=0;
        char ar[]=new char[50];
        while(file.available()!=0)
        {
            ar[i++]=(char)file.read();
        }
        String st=String.valueOf(ar);
        StringTokenizer s=new StringTokenizer(st);
        while(s.hasMoreTokens())
        {
            String ch =s.nextToken();
            try{
                sum=sum+(Integer.parseInt(ch));
            }catch(NumberFormatException e){
                System.out.println(e);
            }
            
        }
        System.out.println(sum);
            file.close();
    }
    
}
