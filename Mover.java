// import java.util.*;
class shape
{   
    shape(int i){
        System.out.println(i);
    }
    void area(int i)
    {
        System.out.println("Area of the cube is : "+ (int)Math.pow(i, 2));

    }
    void area(int i,int j)
    {
        System.out.println("Area of the rectangle : "+ i*j);
    }
}

class areClass{
    public static void main(String args[]) {
        // Scanner sc=new Scanner(System.in);
        // shape ob=new shape();
        // System.out.println("enter the square");
        // int s=sc.nextInt();
        // ob.area(s);
        shape ob =new shape(5);
        ob.area(5);
        ob.area(5, 10);
        
    }

}