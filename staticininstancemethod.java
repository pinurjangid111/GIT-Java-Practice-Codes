public class staticininstancemethod {
    
    public static void main(String args[])
    {
        Test obj = new Test();
        obj.disp();
    }
}
class Test 
{
    static int mult()
    {
        int x=10,y=20;
        int z=x*y;
        return z;
    }
    void disp()
    {
        int a = mult();
        System.out.println("MUltiplication is : "+a);
    }
}
