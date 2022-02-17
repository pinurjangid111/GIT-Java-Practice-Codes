import java.util.Scanner;
public class oddeven
{
    public static void main(String args[])
    {
        int a;
        Scanner obj = new Scanner (System.in);
        System.out.print("Enter a number to check : ");
        a = obj.nextInt();
        if(a%2==0)
            System.out.println(a+ " is EVEN");
            else
            System.out.println(a+ " is ODD");
    }}