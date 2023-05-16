public class Reverse {
    public static void main(String[] args) {
        int input=12;
        int out=0;
        while(input>0)
        {
        out<<=1;
        if((int)(input &1)==1)
          {
            out^=1;
          }
          input>>=1;
        }
     System.out.print(out);
    }
}
