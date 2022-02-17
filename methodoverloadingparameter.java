public class methodoverloadingparameter
{
    public static void main(String args[])
    {
        Addition obj = new Addition();
        obj.disp(10);
        obj.disp(20,50);

    }
}
class Addition 
{
    void disp(int a)
    {
        int x=a;
        System.out.println("Value of A is : "+x);
    }
    void disp(int a,int b)
    {
        int x=a,y=b,z;
        z=x+y;
        System.out.println("Addition is : "+z);

    }
}