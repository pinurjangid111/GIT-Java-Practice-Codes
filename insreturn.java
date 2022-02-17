import java.util.*;
public class insreturn {
    public static void main(String args[])
    {
        Test obj= new Test();
        System.out.println("Addition is : "+obj.add());
        int r = obj.mult(0,0);
        System.out.println("Multiplication is : "+r);
    }
    
}
class Test 
{
    int add()
    {
        int a,b;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter 2 number :");
        a = obj.nextInt();
        b = obj.nextInt();
        
        
        return(a+b);
    }
    int mult(int x,int y)
    {
        int m;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter 2 number : ");
        x=obj.nextInt();
        y=obj.nextInt();
        m=x*y;
        return(m);
    }
}
