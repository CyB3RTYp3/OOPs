import java.io.*;
import java.util.Scanner;
public class File_write {
    public static void main(String[] args) throws IOException {
        FileInputStream f1=new FileInputStream("demo.txt");
        File f=new File("file.txt");
        f.createNewFile();
        FileOutputStream f2=new FileOutputStream(f);
        Scanner sc=new Scanner(f1);
        while(f1.available()!=0)
        {
            f2.write(f1.read());
        }
    }
}
