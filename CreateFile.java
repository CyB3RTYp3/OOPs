import java.io.*;
import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors
 class CreateFile {
  public static void main(String[] args) {
    try {
      File f1 = new File("filename.txt");
      f1.createNewFile();
      FileWriter t1=new FileWriter(f1);
      t1.write("hello my name is hehhe \n build \n bye");
      t1.close();
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
   
  }
}