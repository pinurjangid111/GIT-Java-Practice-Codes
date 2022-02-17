public class instancewithparameter
{
    public static void main(String args[])
    {
        instancewithparameter obj = new instancewithparameter();
        obj.disp(10,20);
     
    }
    void disp(int a,int b)
    {
        int x=a;
        int y=b;
        int z= x*y;
        System.out.println("Instance With Parameter is : "+z);
    }
}