import java.util.*;
public class nestins
{
    public static void main(String args[])
    {
        Test obj = new Test();
        obj.disp();
    }
}
class Test
{
    void disp()
    {
        Test1 ob=new Test1();
        int x= ob.add();
        System.out.println("Addition is : "+x);
    }
}
class Test1
{
    int add()
    {
        Scanner q1=new Scanner(System.in);
        System.out.println("Enter 2 numbers :");
        int a=q1.nextInt();
        int b=q1.nextInt();
        int z=a+b;
        return z;
    }
}   