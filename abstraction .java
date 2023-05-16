abstract class shape
{
    abstract void numberOfSide();
}

class Rectangle extends shape
{
    void numberOfSide()
    {
      System.out.println("Numberr ofg isew is 4");
    }
}

class polygon extends shape
{
    void numberOfSide()
    {
        System.out.println("Number of side is 5");
    }
}
class abstraction 
{
   public static void main(String[] args) {
    shape s=new Rectangle();
    shape r=new polygon();
    s.numberOfSide();
    r.numberOfSide();
   }
}


//code works