// import java.util.*;
class Perimeter
{
    Perimeter(int i)
    {
        System.out.println("Perimetr of square :"+ 4*i);
    }
    
    Perimeter(int i,int j)
    {
        System.out.println("Perimetr of rectangle: "+ 2*(i+j));
    }
}

class Coverloading
{
     public static void main(String[] args) {
        
         Perimeter p1=new Perimeter(5);
         Perimeter p2=new Perimeter(5, 10);
     }
}