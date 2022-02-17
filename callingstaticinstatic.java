public class callingstaticinstatic {
    public static void main(String args[])
    {
        Test.disp();
    }

}
class Test
{
    static void disp()
    {
        int x=10;
        System.out.println("Value of x is : "+x);
    }
}
