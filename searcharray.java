import java.util.*;
public class searcharray {
        public static void main(String args[])
        {
            Scanner obj = new Scanner(System.in);
            int num[]= new int[10];
                
            boolean flag=false; 
        
            System.out.println("Enter 10 elements:");
            
            for(int i=0;i<10;i++)
            {
                num[i]=obj.nextInt();
            }
            System.out.println("Enter a number to search : ");
            int z= obj.nextInt();
            for(int i=0;i<num.length;i++)
            {
            if(num[i]==z)
            {
            System.out.println("Found");
            flag=true;
            break;
            }
            } 
            if(flag==false)
            {
            System.out.println("NOT Found");
            }
        }
            
    } 
    
