import java.util.*;
public class dynamicmemoryallocation {
    
    public static void main(String args[])
    {
        Scanner obj = new Scanner (System.in);
        System.out.println("Enter Number of elements you want to search : ");
        int n = obj.nextInt();
        int num[]=new int[n];
        System.out.println("Enter "+n+" elements :");
        for(int i=0;i<n;i++)    
        {
            num[i] = obj.nextInt();
          
        }
        System.out.println("You Entered = ");
        {
            for(int i=0;i<n;i++)
            {
                System.out.println(num[i]);
            }
            
            System.out.println("Length of given number is :" +num.length);
        }
    }
}
