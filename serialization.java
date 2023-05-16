import java.io.*;
import java.io.IOException;
import java.util.*;
class serialization {
    public static void main(String[] args) throws IOException{
        FileInputStream str=new FileInputStream("num.txt");
        int i=0,sum=0;
        char arr[]=new char[50];
        while(str.available()!=0)
        {
          arr[i++]=(char)str.read();
        }
        String st=String.valueOf(arr);
        StringTokenizer s=new StringTokenizer(st);
        while(s.hasMoreTokens())
        {
            String ch=s.nextToken();
            try{
                sum=sum+(Integer.parseInt(ch));
            }
            catch(NumberFormatException e)
            {
                System.out.println(e);
            }
        }
        System.out.println(sum);
        str.close();

    }
}