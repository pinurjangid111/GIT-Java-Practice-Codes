public class staticinstancepart2 {
    public static void main(String args[])
{
    Test1 obj = new Test1();
    obj.disp();
}
}
class Test 
{
    static int mult()
    {
        int x=10,y=20;
        int z= x*y;
        return z;
    }
}
class Test1
{
    void disp()
    {
        int a=Test.mult();
        System.out.println("Multiplication is : "+a);
    }
}

