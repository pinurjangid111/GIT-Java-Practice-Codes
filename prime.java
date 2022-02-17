import java.util.Scanner;
public class prime {
    public static void main(String args[])
    {
        int a;
        int i;
        int temp=0;
        Scanner obj = new Scanner (System.in);
        System.out.print("Enter a number to check :");
        a = obj.nextInt();
        for(i=2;i<=a-1;i++)
        {
            if(a%i==0)
            {
                temp=temp+1;
            }
        }
        if(temp==0)
            System.out.println(a+ " is  prime number");
            else
            System.out.println(a+ " is not prime number");
        }}