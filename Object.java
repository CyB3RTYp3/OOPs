import java.util.*;
class Student
{
 Scanner sc=new Scanner(System.in);
 String name;
 int roll;
 long phone;
 int mark[]=new int[5];
 void read()
 {
    System.out.println("Enter the name");
    name=sc.nextLine();
    System.out.println("Enter the rollno");
    roll=sc.nextInt();
    System.out.println("phone");
    phone=sc.nextLong();
    System.out.println("Enter the marks of 5 sub");
    for(int i=0;i<5;i++)
    {
        mark[i]=sc.nextInt();

    }

 }

 void display()
 {
    System.out.println("Name:" + name);
    System.out.println("roll:"+roll);
    System.out.println("phone :"+phone);
    System.out.print("Marks :  ");
    for(int i=0;i<5;i++)
    {
        System.out.print(mark[i] +" ");

    }
    System.out.println();
 }

}

class Result
{
    public static void main(String args[]) {
        
        Student ob[]=new Student[5];
        for(int i=0;i<5;i++)
        {   ob[i]=new Student();
            ob[i].read();
            ob[i].display();
        }
    }
}