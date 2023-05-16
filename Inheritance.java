import java.util.*;
class Employee
{
    String name;
    int age;
    long phone;
    String addrs;
    int salary;
    void print_Salary()
    {
      System.out.println("Salary : "+ salary);
    }
}

class Manager extends Employee
{
    String specialzation;

}
 class Officer extends Employee
 {
    String department;

 }

 class Inheritance{
 
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        Manager man=new Manager();
        Officer off=new Officer();
        System.out.println("Enter the officer Name age phone number address salary departmrnt");
        off.name=sc.nextLine();
        off.age=sc.nextInt();
        off.phone=sc.nextLong();
        sc.nextLine();
        off.addrs=sc.nextLine();
        off.salary=sc.nextInt();
        sc.nextLine();
        off.department=sc.nextLine();
        System.out.println("Enter the Manger Name age phone number address salary Specilization");
        man.name=sc.nextLine();
        man.age=sc.nextInt();
        man.phone=sc.nextLong();
        sc.nextLine();
        man.addrs=sc.nextLine();
        man.salary=sc.nextInt();
        sc.nextLine();
        man.specialzation=sc.nextLine();

        System.out.println(off.name +" " +off.age+" " +off.phone+" "+ off.department);
        System.out.println(man.name+" "+man.age+" "+man.phone+" "+man.salary+" "+man.specialzation );



    }



 }