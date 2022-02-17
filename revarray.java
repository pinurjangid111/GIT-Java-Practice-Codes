import java.util.*;
public class revarray 
    {
        public static void main(String args[])
        {
            Scanner input = new Scanner(System.in);
            int[] a=new int[5];
            int[] b=new int[5];
            System.out.println("Enter 5 array elements : ");
            for(int i=0;i<a.length;i++)
            {
                a[i]=input.nextInt();
            }      
            int j=0;
            for(int i=b.length-1;i>=0;i--)
         { 
            b[i] = a[j];
            j++;
        } 
        for(int i=0;i<b.length;i++)
        {
        System.out.println("The Value of b["+i+"] is : "+b[i]);
    }
    }
    }    
