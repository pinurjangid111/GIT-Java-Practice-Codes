import java.util.*;
public class countarray {
    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        int num[]=new int[20];
        int pos=0,neg=0,zero=0,odd=0,even=0;
        
        for(int i=0;i<num.length;i++)
        {
            System.out.println("Print the value of z["+i+"]");
            num[i]=s.nextInt();

    if(num[i]>0){
        pos++;
    }   
    else if (num[i]<0);{
        neg++;
    }
    else if 
    {
        zero++;
    }
    if(num[i]%2==0){
    even++;
    }
    else{
        odd++;
    }
    }
    System.out.println("positive : "+pos+"\nNegative : "+neg+"\nZero :"+zero+"\nEven : "+even+"\n Odd : "+odd);

}
    
}
