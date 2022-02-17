import java.util.*;
public class userinputoneDarray {
    public static void main(String args[])
    {
        Scanner obj = new Scanner (System.in);
        int num[] = new int[3];
        System.out.println("Enter 3 integer values : ");
        for(int i=0;i<3;i++)
        {
            num[i] = obj.nextInt();
        }
        System.out.println("YOU ENTERED : ");
        for(int i=0;i<3;i++)
        {
            System.out.println(num[i]);
        }
    }

}
