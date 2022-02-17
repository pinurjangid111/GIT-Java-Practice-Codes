import java.util.*;
public class average 
{
        public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter total number count you want to enter :");
        int s=nextInt();
        
        int []num = new int[s];
         int    total = 0;
         for(int i=0; i<s; i++)
         {
            num[i]=obj.nextInt();
         }

        for(int i=0; i<num.length; i++){
        	total = total + num[i];
        }
        double average = total / num[i].length;
        
    
        System.out.format("The average is: ", average);
    }
}